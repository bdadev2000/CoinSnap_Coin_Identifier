package com.glority.imagepicker.adapter;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.glority.imagepicker.R;
import com.glority.imagepicker.bean.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class ImageGridAdapter extends BaseAdapter {
    private static final int TYPE_CAMERA = 0;
    private static final int TYPE_NORMAL = 1;
    private Context mContext;
    final int mGridWidth;
    private LayoutInflater mInflater;
    private boolean showCamera;
    private boolean showSelectIndicator = true;
    private List<Image> mImages = new ArrayList();
    private List<Image> mSelectedImages = new ArrayList();

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }

    public ImageGridAdapter(Context context, boolean z, int i) {
        this.showCamera = true;
        this.mContext = context;
        this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        this.showCamera = z;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        this.mGridWidth = point.x / i;
    }

    public void showSelectIndicator(boolean z) {
        this.showSelectIndicator = z;
    }

    public void setShowCamera(boolean z) {
        Log.e("ImageGridAdapter", "setShowCamera");
        if (this.showCamera == z) {
            return;
        }
        this.showCamera = z;
        notifyDataSetChanged();
    }

    public boolean isShowCamera() {
        return this.showCamera;
    }

    public void select(Image image) {
        Log.e("ImageGridAdapter", "select");
        if (this.mSelectedImages.contains(image)) {
            this.mSelectedImages.remove(image);
        } else {
            this.mSelectedImages.add(image);
        }
        notifyDataSetChanged();
    }

    public void setDefaultSelected(ArrayList<Uri> arrayList) {
        Log.e("ImageGridAdapter", "setDefaultSelected");
        Iterator<Uri> it = arrayList.iterator();
        while (it.hasNext()) {
            Image imageByPath = getImageByPath(it.next());
            if (imageByPath != null) {
                this.mSelectedImages.add(imageByPath);
            }
        }
        if (this.mSelectedImages.size() > 0) {
            Log.e("ImageGridAdapter", "setDefaultSelected1");
            notifyDataSetChanged();
        }
    }

    private Image getImageByPath(Uri uri) {
        List<Image> list = this.mImages;
        if (list == null || list.size() <= 0) {
            return null;
        }
        for (Image image : this.mImages) {
            if (image != null && image.uri != null && image.uri.equals(uri)) {
                return image;
            }
        }
        return null;
    }

    public void setData(List<Image> list) {
        Log.e("ImageGridAdapter", "setData");
        this.mSelectedImages.clear();
        if (list != null && list.size() > 0) {
            this.mImages = list;
        } else {
            this.mImages.clear();
        }
        notifyDataSetChanged();
    }

    public void addShotImage(Image image) {
        Log.e("ImageGridAdapter", "addShotImage");
        if (this.showCamera) {
            this.mImages.add(0, image);
        } else {
            this.mImages.add(0, image);
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return (this.showCamera && i == 0) ? 0 : 1;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.showCamera ? this.mImages.size() + 1 : this.mImages.size();
    }

    @Override // android.widget.Adapter
    public Image getItem(int i) {
        if (!this.showCamera) {
            return this.mImages.get(i);
        }
        if (i == 0) {
            return null;
        }
        return this.mImages.get(i - 1);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (isShowCamera() && i == 0) {
            return this.mInflater.inflate(R.layout.mis_list_item_camera, viewGroup, false);
        }
        if (view == null) {
            view = this.mInflater.inflate(R.layout.mis_list_item_image, viewGroup, false);
            viewHolder = new ViewHolder(view);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        if (viewHolder != null) {
            viewHolder.bindData(getItem(i));
        }
        return view;
    }

    /* loaded from: classes6.dex */
    class ViewHolder {
        ImageView image;
        TextView indicator;
        View mask;

        ViewHolder(View view) {
            this.image = (ImageView) view.findViewById(R.id.image);
            this.indicator = (TextView) view.findViewById(R.id.checkmark);
            this.mask = view.findViewById(R.id.mask);
            view.setTag(this);
        }

        void bindData(Image image) {
            if (image == null) {
                return;
            }
            if (ImageGridAdapter.this.showSelectIndicator) {
                this.indicator.setVisibility(0);
                int indexOf = ImageGridAdapter.this.mSelectedImages.indexOf(image);
                if (indexOf >= 0) {
                    this.indicator.setSelected(true);
                    this.indicator.setText(String.valueOf(indexOf + 1));
                    this.mask.setVisibility(0);
                } else {
                    this.indicator.setSelected(false);
                    this.indicator.setText("");
                    this.mask.setVisibility(8);
                }
            } else {
                this.indicator.setVisibility(8);
            }
            if (image.uri != null) {
                Glide.with(ImageGridAdapter.this.mContext).load(image.uri).override(ImageGridAdapter.this.mGridWidth, ImageGridAdapter.this.mGridWidth).centerCrop().into(this.image);
            } else {
                this.image.setImageResource(R.drawable.mis_default_image);
            }
        }
    }
}
