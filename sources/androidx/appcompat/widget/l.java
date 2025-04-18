package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes.dex */
public final class l extends AppCompatImageView implements n {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f914b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f914b = mVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        com.bumptech.glide.c.T(this, getContentDescription());
        setOnTouchListener(new k(this, this, mVar, 0));
    }

    @Override // androidx.appcompat.widget.n
    public final boolean a() {
        return false;
    }

    @Override // androidx.appcompat.widget.n
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f914b.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i10, int i11, int i12, int i13) {
        boolean frame = super.setFrame(i10, i11, i12, i13);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            h0.a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
