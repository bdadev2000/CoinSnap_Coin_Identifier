package te;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class e extends View {

    /* renamed from: h, reason: collision with root package name */
    public static final int f25385h = Color.argb(160, 255, 255, 255);

    /* renamed from: b, reason: collision with root package name */
    public ge.h f25386b;

    /* renamed from: c, reason: collision with root package name */
    public int f25387c;

    /* renamed from: d, reason: collision with root package name */
    public final ColorDrawable f25388d;

    /* renamed from: f, reason: collision with root package name */
    public final ColorDrawable f25389f;

    /* renamed from: g, reason: collision with root package name */
    public final float f25390g;

    public e(Context context) {
        super(context, null);
        this.f25387c = f25385h;
        this.f25388d = new ColorDrawable(this.f25387c);
        this.f25389f = new ColorDrawable(this.f25387c);
        this.f25390g = TypedValue.applyDimension(1, 0.9f, context.getResources().getDisplayMetrics());
    }

    private int getLineCount() {
        int ordinal = this.f25386b.ordinal();
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal != 2) {
            return ordinal != 3 ? 0 : 2;
        }
        return 3;
    }

    public int getGridColor() {
        return this.f25387c;
    }

    @NonNull
    public ge.h getGridMode() {
        return this.f25386b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        int lineCount = getLineCount();
        for (int i10 = 0; i10 < lineCount; i10++) {
            int lineCount2 = getLineCount();
            if (this.f25386b == ge.h.DRAW_PHI) {
                if (i10 == 1) {
                    f10 = 0.38196602f;
                } else {
                    f10 = 0.618034f;
                }
            } else {
                f10 = (1.0f / (lineCount2 + 1)) * (i10 + 1.0f);
            }
            canvas.translate(0.0f, getHeight() * f10);
            this.f25388d.draw(canvas);
            float f11 = -f10;
            canvas.translate(0.0f, getHeight() * f11);
            canvas.translate(f10 * getWidth(), 0.0f);
            this.f25389f.draw(canvas);
            canvas.translate(f11 * getWidth(), 0.0f);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ColorDrawable colorDrawable = this.f25388d;
        float f10 = this.f25390g;
        colorDrawable.setBounds(i10, 0, i12, (int) f10);
        this.f25389f.setBounds(0, i11, (int) f10, i13);
    }

    public void setGridColor(int i10) {
        this.f25387c = i10;
        this.f25388d.setColor(i10);
        this.f25389f.setColor(i10);
        postInvalidate();
    }

    public void setGridMode(@NonNull ge.h hVar) {
        this.f25386b = hVar;
        postInvalidate();
    }
}
