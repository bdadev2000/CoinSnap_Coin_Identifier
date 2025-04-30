package i7;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: classes3.dex */
public final class g extends RelativeLayout {
    private ImageView imageView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context);
        G7.j.e(context, "context");
        initView(context);
    }

    private final void initView(Context context) {
        this.imageView = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setLayoutParams(layoutParams);
            ImageView imageView2 = this.imageView;
            if (imageView2 != null) {
                imageView2.setAdjustViewBounds(true);
                ImageView imageView3 = this.imageView;
                if (imageView3 != null) {
                    addView(imageView3);
                    requestLayout();
                    return;
                } else {
                    G7.j.k("imageView");
                    throw null;
                }
            }
            G7.j.k("imageView");
            throw null;
        }
        G7.j.k("imageView");
        throw null;
    }

    public final void destroy() {
        ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setImageDrawable(null);
            ImageView imageView2 = this.imageView;
            if (imageView2 != null) {
                if (imageView2.getParent() != null) {
                    ImageView imageView3 = this.imageView;
                    if (imageView3 != null) {
                        ViewParent parent = imageView3.getParent();
                        G7.j.c(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) parent;
                        ImageView imageView4 = this.imageView;
                        if (imageView4 != null) {
                            viewGroup.removeView(imageView4);
                            return;
                        } else {
                            G7.j.k("imageView");
                            throw null;
                        }
                    }
                    G7.j.k("imageView");
                    throw null;
                }
                return;
            }
            G7.j.k("imageView");
            throw null;
        }
        G7.j.k("imageView");
        throw null;
    }

    public final ImageView getMainImage$vungle_ads_release() {
        ImageView imageView = this.imageView;
        if (imageView != null) {
            return imageView;
        }
        G7.j.k("imageView");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        G7.j.e(context, "context");
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        G7.j.e(context, "context");
        initView(context);
    }
}
