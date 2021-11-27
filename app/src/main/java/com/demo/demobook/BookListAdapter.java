package com.demo.demobook;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class BookListAdapter  extends BaseAdapter {

    private List<Book> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public BookListAdapter(Context aContext, List<Book> listData) {
        this.context = aContext;
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }



    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_item_layout, null);
            holder = new ViewHolder();
            holder.iconBookView = (ImageView) convertView.findViewById(R.id.imageView_bookIcon);
            holder.bookNameView = (TextView) convertView.findViewById(R.id.textView_bookName);
            holder.authorBookView = (TextView) convertView.findViewById(R.id.textView_bookAuthor);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Book book = this.listData.get(position);
        holder.bookNameView.setText(book.getBookName());
        holder.authorBookView.setText("Tác giả : " + book.getBookAuther());

        int imageId = this.getMipmapResIdByName(book.getBookIconName());

        holder.iconBookView.setImageResource(imageId);

        return convertView;
    }

    // Find Image ID corresponding to the name of the image (in the directory mipmap).
    public int getMipmapResIdByName(String resName)  {
        String pkgName = context.getPackageName();
        // Return 0 if not found.
        int resID = context.getResources().getIdentifier(resName , "mipmap", pkgName);
        Log.i("BookListView", "Res Name: "+ resName+"==> Res ID = "+ resID);
        return resID;
    }

    static class ViewHolder {
        ImageView iconBookView;
        TextView bookNameView;
        TextView authorBookView;
    }

}
