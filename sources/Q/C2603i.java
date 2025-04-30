package q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.tools.arruler.photomeasure.camera.ruler.R;
import p.C2523b;

/* renamed from: q.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2603i extends AppCompatImageView implements InterfaceC2607k {
    public final /* synthetic */ C2605j b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2603i(C2605j c2605j, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.b = c2605j;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        com.facebook.appevents.i.q(this, getContentDescription());
        setOnTouchListener(new C2523b(this, this));
    }

    @Override // q.InterfaceC2607k
    public final boolean a() {
        return false;
    }

    @Override // q.InterfaceC2607k
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.b.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i9, int i10, int i11, int i12) {
        boolean frame = super.setFrame(i9, i10, i11, i12);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            M.a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
