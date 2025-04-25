package com.glority.android.guide.base;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MyBaseAdapter.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\"B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0015\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0013H\u0016¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J.\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H&J\b\u0010!\u001a\u00020\u0013H&R\u001a\u0010\b\u001a\u00020\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006#"}, d2 = {"Lcom/glority/android/guide/base/MyBaseAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/widget/BaseAdapter;", "context", "Landroid/content/Context;", "list", "", "(Landroid/content/Context;Ljava/util/List;)V", "mContext", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "myList", "getMyList", "()Ljava/util/List;", "setMyList", "(Ljava/util/List;)V", "getCount", "", "getItem", "arg0", "(I)Ljava/lang/Object;", "getItemId", "", "getView", "Landroid/view/View;", "position", "convertView", "parent", "Landroid/view/ViewGroup;", "holder", "Lcom/glority/android/guide/base/MyBaseAdapter$ViewHolder;", "itemLayoutRes", "ViewHolder", "base-guide_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes13.dex */
public abstract class MyBaseAdapter<T> extends BaseAdapter {
    private Context mContext;
    private List<? extends T> myList;

    @Override // android.widget.Adapter
    public long getItemId(int arg0) {
        return arg0;
    }

    public abstract View getView(int position, View convertView, ViewGroup parent, ViewHolder holder);

    public abstract int itemLayoutRes();

    public MyBaseAdapter(Context context, List<? extends T> list) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.mContext = context;
        if (list == null) {
            this.myList = new ArrayList();
        }
        this.myList = list;
    }

    protected final Context getMContext() {
        return this.mContext;
    }

    protected final void setMContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final List<T> getMyList() {
        return this.myList;
    }

    public final void setMyList(List<? extends T> list) {
        this.myList = list;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<? extends T> list = this.myList;
        Intrinsics.checkNotNull(list);
        return list.size();
    }

    @Override // android.widget.Adapter
    public T getItem(int arg0) {
        List<? extends T> list = this.myList;
        Intrinsics.checkNotNull(list);
        return list.get(arg0);
    }

    @Override // android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = View.inflate(this.mContext, itemLayoutRes(), null);
            Intrinsics.checkNotNullExpressionValue(convertView, "inflate(mContext, itemLayoutRes(), null)");
            viewHolder = new ViewHolder();
            convertView.setTag(viewHolder);
        } else {
            Object tag = convertView.getTag();
            if (tag == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.glority.android.guide.base.MyBaseAdapter.ViewHolder");
            }
            viewHolder = (ViewHolder) tag;
        }
        return getView(position, convertView, parent, viewHolder);
    }

    /* compiled from: MyBaseAdapter.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J)\u0010\n\u001a\u0004\u0018\u0001H\u000b\"\n\b\u0001\u0010\u000b*\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fR\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/glority/android/guide/base/MyBaseAdapter$ViewHolder;", "", "()V", "views", "Landroid/util/SparseArray;", "Landroid/view/View;", "getViews", "()Landroid/util/SparseArray;", "setViews", "(Landroid/util/SparseArray;)V", "obtainView", ExifInterface.GPS_DIRECTION_TRUE, "convertView", "resId", "", "(Landroid/view/View;I)Landroid/view/View;", "base-guide_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes13.dex */
    public static final class ViewHolder {
        private SparseArray<View> views = new SparseArray<>();

        public final SparseArray<View> getViews() {
            return this.views;
        }

        public final void setViews(SparseArray<View> sparseArray) {
            Intrinsics.checkNotNullParameter(sparseArray, "<set-?>");
            this.views = sparseArray;
        }

        /* JADX WARN: Incorrect return type in method signature: <T:Landroid/view/View;>(Landroid/view/View;I)TT; */
        public final View obtainView(View convertView, int resId) {
            Intrinsics.checkNotNullParameter(convertView, "convertView");
            View view = this.views.get(resId);
            if (view != null) {
                return view;
            }
            View findViewById = convertView.findViewById(resId);
            this.views.put(resId, findViewById);
            return findViewById;
        }
    }
}
