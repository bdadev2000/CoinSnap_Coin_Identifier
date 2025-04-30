package com.skydoves.balloon.overlay;

import G7.j;
import G7.l;
import G7.s;
import M7.c;
import a7.b;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import n6.AbstractC2482c;
import n6.C2481b;
import z2.i;

/* loaded from: classes3.dex */
public final class BalloonAnchorOverlayView extends View {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ c[] f19617n;
    public final b b;

    /* renamed from: c, reason: collision with root package name */
    public final b f19618c;

    /* renamed from: d, reason: collision with root package name */
    public final b f19619d;

    /* renamed from: f, reason: collision with root package name */
    public final b f19620f;

    /* renamed from: g, reason: collision with root package name */
    public final b f19621g;

    /* renamed from: h, reason: collision with root package name */
    public final b f19622h;

    /* renamed from: i, reason: collision with root package name */
    public final b f19623i;

    /* renamed from: j, reason: collision with root package name */
    public Bitmap f19624j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f19625k;
    public final Paint l;
    public boolean m;

    static {
        l lVar = new l(BalloonAnchorOverlayView.class, "anchorView", "getAnchorView()Landroid/view/View;");
        s.f1335a.getClass();
        f19617n = new c[]{lVar, new l(BalloonAnchorOverlayView.class, "anchorViewList", "getAnchorViewList()Ljava/util/List;"), new l(BalloonAnchorOverlayView.class, "overlayColor", "getOverlayColor()I"), new l(BalloonAnchorOverlayView.class, "overlayPaddingColor", "getOverlayPaddingColor()I"), new l(BalloonAnchorOverlayView.class, "overlayPadding", "getOverlayPadding()F"), new l(BalloonAnchorOverlayView.class, "overlayPosition", "getOverlayPosition()Landroid/graphics/Point;"), new l(BalloonAnchorOverlayView.class, "balloonOverlayShape", "getBalloonOverlayShape()Lcom/skydoves/balloon/overlay/BalloonOverlayShape;")};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalloonAnchorOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.e(context, "context");
        this.b = i.r(this, null);
        this.f19618c = i.r(this, null);
        this.f19619d = i.r(this, 0);
        this.f19620f = i.r(this, 0);
        this.f19621g = i.r(this, Float.valueOf(0.0f));
        this.f19622h = i.r(this, null);
        this.f19623i = i.r(this, C2481b.f21853a);
        Paint paint = new Paint(1);
        this.f19625k = paint;
        Paint paint2 = new Paint(1);
        this.l = paint2;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
        paint2.setDither(true);
    }

    private final int getStatusBarHeight() {
        Rect rect = new Rect();
        Context context = getContext();
        if (context instanceof Activity) {
            ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            return rect.top;
        }
        return 0;
    }

    public final void a(View view, Canvas canvas) {
        RectF rectF;
        if (view != null) {
            view.getGlobalVisibleRect(new Rect());
            if (getOverlayPosition() != null) {
                rectF = new RectF(r1.x - getOverlayPadding(), (r1.y - getOverlayPadding()) + getStatusBarHeight(), getOverlayPadding() + view.getWidth() + r1.x, getOverlayPadding() + view.getHeight() + r1.y + getStatusBarHeight());
            } else {
                rectF = new RectF(r0.left - getOverlayPadding(), r0.top - getOverlayPadding(), getOverlayPadding() + r0.right, getOverlayPadding() + r0.bottom);
            }
            float overlayPadding = getOverlayPadding() / 2;
            RectF rectF2 = new RectF(rectF);
            rectF2.inset(overlayPadding, overlayPadding);
            if (getBalloonOverlayShape() instanceof C2481b) {
                canvas.drawOval(rectF, this.f19625k);
                canvas.drawOval(rectF2, this.l);
                return;
            }
            throw new RuntimeException();
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        View anchorView;
        View anchorView2;
        Bitmap bitmap;
        j.e(canvas, "canvas");
        if ((this.m || (bitmap = this.f19624j) == null || (bitmap != null && bitmap.isRecycled())) && getWidth() != 0 && getHeight() != 0 && (((anchorView = getAnchorView()) == null || anchorView.getWidth() != 0) && ((anchorView2 = getAnchorView()) == null || anchorView2.getHeight() != 0))) {
            Bitmap bitmap2 = this.f19624j;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                bitmap2.recycle();
            }
            Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            this.f19624j = createBitmap;
            Canvas canvas2 = new Canvas(createBitmap);
            Paint paint = this.f19625k;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
            paint.setColor(getOverlayColor());
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            paint.setColor(0);
            Paint paint2 = this.l;
            paint2.setColor(getOverlayPaddingColor());
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(getOverlayPadding());
            List<View> anchorViewList = getAnchorViewList();
            if (anchorViewList != null && !anchorViewList.isEmpty()) {
                List<View> anchorViewList2 = getAnchorViewList();
                if (anchorViewList2 != null) {
                    Iterator<T> it = anchorViewList2.iterator();
                    while (it.hasNext()) {
                        a((View) it.next(), canvas2);
                    }
                }
            } else {
                a(getAnchorView(), canvas2);
            }
            this.m = false;
        }
        Bitmap bitmap3 = this.f19624j;
        if (bitmap3 != null && !bitmap3.isRecycled()) {
            canvas.drawBitmap(bitmap3, 0.0f, 0.0f, (Paint) null);
        }
    }

    public final View getAnchorView() {
        return (View) this.b.r(f19617n[0], this);
    }

    public final List<View> getAnchorViewList() {
        return (List) this.f19618c.r(f19617n[1], this);
    }

    public final AbstractC2482c getBalloonOverlayShape() {
        return (AbstractC2482c) this.f19623i.r(f19617n[6], this);
    }

    public final int getOverlayColor() {
        return ((Number) this.f19619d.r(f19617n[2], this)).intValue();
    }

    public final float getOverlayPadding() {
        return ((Number) this.f19621g.r(f19617n[4], this)).floatValue();
    }

    public final int getOverlayPaddingColor() {
        return ((Number) this.f19620f.r(f19617n[3], this)).intValue();
    }

    public final Point getOverlayPosition() {
        return (Point) this.f19622h.r(f19617n[5], this);
    }

    @Override // android.view.View
    public final void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        super.onLayout(z8, i9, i10, i11, i12);
        this.m = true;
    }

    public final void setAnchorView(View view) {
        this.b.B(f19617n[0], view);
    }

    public final void setAnchorViewList(List<? extends View> list) {
        this.f19618c.B(f19617n[1], list);
    }

    public final void setBalloonOverlayShape(AbstractC2482c abstractC2482c) {
        j.e(abstractC2482c, "<set-?>");
        this.f19623i.B(f19617n[6], abstractC2482c);
    }

    public final void setOverlayColor(int i9) {
        this.f19619d.B(f19617n[2], Integer.valueOf(i9));
    }

    public final void setOverlayPadding(float f9) {
        this.f19621g.B(f19617n[4], Float.valueOf(f9));
    }

    public final void setOverlayPaddingColor(int i9) {
        this.f19620f.B(f19617n[3], Integer.valueOf(i9));
    }

    public final void setOverlayPosition(Point point) {
        this.f19622h.B(f19617n[5], point);
    }
}
