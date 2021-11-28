package com.example.gmail_interface;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends BaseAdapter {

    List<ItemModel> items;

    public ItemAdapter(List<ItemModel> items) {
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;

        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_item_layout, null);

            viewHolder = new ViewHolder();

            viewHolder.buttonName = view.findViewById(R.id.button_name);
            viewHolder.textSender = view.findViewById(R.id.text_sender);
            viewHolder.textTitle = view.findViewById(R.id.text_title);
            viewHolder.textContent = view.findViewById(R.id.text_content);
            viewHolder.textTimeReceive = view.findViewById(R.id.text_time_receive);
            viewHolder.checkSelect = view.findViewById(R.id.check_select);

            view.setTag(viewHolder);
        } else
            viewHolder = (ViewHolder) view.getTag();

        ItemModel item = items.get(i);

        viewHolder.textSender.setText(item.getSenderName());
        viewHolder.textTitle.setText(item.getTitle());
        viewHolder.textContent.setText(item.getContent());
        viewHolder.buttonName.setText(item.getSenderName().charAt(0)+"");
        viewHolder.textTimeReceive.setText(item.getTimeReceive());
        viewHolder.checkSelect.setChecked(item.isSelected());

        switch (item.getColor()) {
            case 1 :
                viewHolder.buttonName.setBackgroundResource(R.drawable.text_button_background_1);
                break;
            case 2 :
                viewHolder.buttonName.setBackgroundResource(R.drawable.text_button_background_2);
                break;
            case 3 :
                viewHolder.buttonName.setBackgroundResource(R.drawable.text_button_background_3);
                break;
            case 4 :
                viewHolder.buttonName.setBackgroundResource(R.drawable.text_button_background_4);
                break;
            case 5 :
                viewHolder.buttonName.setBackgroundResource(R.drawable.text_button_background_5);
                break;
            case 6 :
                viewHolder.buttonName.setBackgroundResource(R.drawable.text_button_background_6);
                break;
            case 7 :
                viewHolder.buttonName.setBackgroundResource(R.drawable.text_button_background_7);
                break;
            case 8 :
                viewHolder.buttonName.setBackgroundResource(R.drawable.text_button_background_8);
                break;
            default:
                viewHolder.buttonName.setBackgroundResource(R.drawable.text_button_background_9);
        }

        viewHolder.checkSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                item.setSelected(viewHolder.checkSelect.isChecked());
                notifyDataSetChanged();
            }
        });

        return view;
    }

    private class ViewHolder {
        public Button buttonName;
        public TextView textSender;
        public TextView textTitle;
        public TextView textContent;
        public TextView textTimeReceive;
        public CheckBox checkSelect;
    }
}
