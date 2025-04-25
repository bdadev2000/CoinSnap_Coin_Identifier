package com.glority.imagepicker.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.webkit.ProxyConfig;
import com.bumptech.glide.Glide;
import com.glority.imagepicker.R;
import com.glority.imagepicker.bean.Folder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class FolderAdapter extends BaseAdapter {
    private Context mContext;
    int mImageSize;
    private LayoutInflater mInflater;
    private List<Folder> mFolders = new ArrayList();
    int lastSelected = 0;

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public FolderAdapter(Context context) {
        this.mContext = context;
        this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        this.mImageSize = this.mContext.getResources().getDimensionPixelOffset(R.dimen.mis_folder_cover_size);
    }

    public void setData(List<Folder> list) {
        if (list != null && list.size() > 0) {
            this.mFolders = list;
        } else {
            this.mFolders.clear();
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.mFolders.size() + 1;
    }

    @Override // android.widget.Adapter
    public Folder getItem(int i) {
        if (i == 0) {
            return null;
        }
        return this.mFolders.get(i - 1);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = this.mInflater.inflate(R.layout.mis_list_item_folder, viewGroup, false);
            viewHolder = new ViewHolder(view);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        if (viewHolder != null) {
            if (i == 0) {
                viewHolder.name.setText(R.string.mis_folder_all);
                viewHolder.path.setText("/sdcard");
                viewHolder.size.setText(String.format("%d%s", Integer.valueOf(getTotalImageSize()), this.mContext.getResources().getString(R.string.mis_photo_unit)));
                if (this.mFolders.size() > 0) {
                    Folder folder = this.mFolders.get(0);
                    if (folder != null && folder.cover != null) {
                        Glide.with(this.mContext).load(folder.cover.uri).error(R.drawable.mis_default_error).override(this.mContext.getResources().getDimensionPixelSize(R.dimen.mis_folder_cover_size), this.mContext.getResources().getDimensionPixelSize(R.dimen.mis_folder_cover_size)).centerCrop().into(viewHolder.cover);
                    } else {
                        viewHolder.cover.setImageResource(R.drawable.mis_default_error);
                    }
                }
            } else {
                viewHolder.bindData(getItem(i));
            }
            if (this.lastSelected == i) {
                viewHolder.indicator.setVisibility(0);
            } else {
                viewHolder.indicator.setVisibility(4);
            }
        }
        return view;
    }

    private int getTotalImageSize() {
        List<Folder> list = this.mFolders;
        int i = 0;
        if (list != null && list.size() > 0) {
            Iterator<Folder> it = this.mFolders.iterator();
            while (it.hasNext()) {
                i += it.next().images.size();
            }
        }
        return i;
    }

    public void setSelectIndex(int i) {
        if (this.lastSelected == i) {
            return;
        }
        this.lastSelected = i;
        notifyDataSetChanged();
    }

    public int getSelectIndex() {
        return this.lastSelected;
    }

    /* loaded from: classes6.dex */
    class ViewHolder {
        ImageView cover;
        ImageView indicator;
        TextView name;
        TextView path;
        TextView size;

        ViewHolder(View view) {
            this.cover = (ImageView) view.findViewById(R.id.cover);
            this.name = (TextView) view.findViewById(R.id.name);
            this.path = (TextView) view.findViewById(R.id.path);
            this.size = (TextView) view.findViewById(R.id.size);
            this.indicator = (ImageView) view.findViewById(R.id.indicator);
            view.setTag(this);
        }

        void bindData(Folder folder) {
            if (folder == null) {
                return;
            }
            this.name.setText(folder.name);
            this.path.setText(folder.path);
            if (folder.images != null) {
                this.size.setText(String.format("%d%s", Integer.valueOf(folder.images.size()), FolderAdapter.this.mContext.getResources().getString(R.string.mis_photo_unit)));
            } else {
                this.size.setText(ProxyConfig.MATCH_ALL_SCHEMES + FolderAdapter.this.mContext.getResources().getString(R.string.mis_photo_unit));
            }
            if (folder.cover != null) {
                try {
                    Glide.with(FolderAdapter.this.mContext).load(folder.cover.uri).error(R.drawable.mis_default_error).override(FolderAdapter.this.mContext.getResources().getDimensionPixelSize(R.dimen.mis_folder_cover_size), FolderAdapter.this.mContext.getResources().getDimensionPixelSize(R.dimen.mis_folder_cover_size)).centerCrop().into(this.cover);
                } catch (Throwable unused) {
                }
            } else {
                this.cover.setImageResource(R.drawable.mis_default_error);
            }
        }
    }
}
