package ve;

import android.graphics.PointF;
import android.graphics.RectF;

/* loaded from: classes4.dex */
public final class a implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public final RectF f26519b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26520c;

    public a(int i10, RectF rectF) {
        this.f26519b = rectF;
        this.f26520c = i10;
    }

    public static void a(RectF rectF, PointF pointF) {
        rectF.left = Math.min(rectF.left, pointF.x);
        rectF.top = Math.min(rectF.top, pointF.y);
        rectF.right = Math.max(rectF.right, pointF.x);
        rectF.bottom = Math.max(rectF.bottom, pointF.y);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return -Integer.valueOf(this.f26520c).compareTo(Integer.valueOf(((a) obj).f26520c));
    }
}
