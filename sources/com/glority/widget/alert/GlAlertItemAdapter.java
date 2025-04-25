package com.glority.widget.alert;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.widget.R;
import com.glority.widget.alert.GlAlert;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlAlertItemAdapter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/glority/widget/alert/GlAlertItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/glority/widget/alert/GlAlertItemAdapter$Holder;", "data", "", "Lcom/glority/widget/alert/GlAlertItem;", "orientation", "Lcom/glority/widget/alert/GlAlert$Orientation;", "alert", "Lcom/glority/widget/alert/GlAlert$Builder;", "(Ljava/util/List;Lcom/glority/widget/alert/GlAlert$Orientation;Lcom/glority/widget/alert/GlAlert$Builder;)V", "getAlert", "()Lcom/glority/widget/alert/GlAlert$Builder;", "setAlert", "(Lcom/glority/widget/alert/GlAlert$Builder;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Holder", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlAlertItemAdapter extends RecyclerView.Adapter<Holder> {
    private GlAlert.Builder alert;
    private final List<GlAlertItem> data;
    private final GlAlert.Orientation orientation;

    public final GlAlert.Builder getAlert() {
        return this.alert;
    }

    public final void setAlert(GlAlert.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<set-?>");
        this.alert = builder;
    }

    public GlAlertItemAdapter(List<GlAlertItem> data, GlAlert.Orientation orientation, GlAlert.Builder alert) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(alert, "alert");
        this.data = data;
        this.orientation = orientation;
        this.alert = alert;
    }

    /* compiled from: GlAlertItemAdapter.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/glority/widget/alert/GlAlertItemAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "iv", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getIv", "()Landroid/widget/ImageView;", "tv", "Landroid/widget/TextView;", "getTv", "()Landroid/widget/TextView;", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public static final class Holder extends RecyclerView.ViewHolder {
        private final ImageView iv;
        private final TextView tv;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.tv = (TextView) view.findViewById(R.id.tv);
            this.iv = (ImageView) view.findViewById(R.id.iv);
        }

        public final TextView getTv() {
            return this.tv;
        }

        public final ImageView getIv() {
            return this.iv;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.orientation == GlAlert.Orientation.HORIZONTAL) {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.gl_alert_item_vert, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…_item_vert, parent,false)");
            return new Holder(inflate);
        }
        View inflate2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.gl_alert_item_hor, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate2, "LayoutInflater.from(pare…t_item_hor, parent,false)");
        return new Holder(inflate2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final GlAlertItem glAlertItem = this.data.get(position);
        if (glAlertItem.getDrawable() == null) {
            ImageView iv = holder.getIv();
            Intrinsics.checkNotNullExpressionValue(iv, "holder.iv");
            iv.setVisibility(8);
        } else {
            holder.getIv().setImageDrawable(glAlertItem.getDrawable());
        }
        TextView tv = holder.getTv();
        Intrinsics.checkNotNullExpressionValue(tv, "holder.tv");
        tv.setText(glAlertItem.getText());
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.glority.widget.alert.GlAlertItemAdapter$onBindViewHolder$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlertDialog alertDialog = GlAlertItemAdapter.this.getAlert().getAlertDialog();
                if (alertDialog != null) {
                    glAlertItem.getOnClickListener().onClick(alertDialog);
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.data.size();
    }
}
