package androidx.core.app;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class l0 extends t0 {

    /* renamed from: e, reason: collision with root package name */
    public IconCompat f1205e;

    /* renamed from: f, reason: collision with root package name */
    public IconCompat f1206f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1207g;

    @Override // androidx.core.app.t0
    public final void b(c1 c1Var) {
        Bitmap a;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(c1Var.f1185b).setBigContentTitle((CharSequence) this.f1250c);
        IconCompat iconCompat = this.f1205e;
        Context context = c1Var.a;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                k0.a(bigContentTitle, h0.c.g(iconCompat, context));
            } else {
                int i10 = iconCompat.a;
                if (i10 == -1) {
                    i10 = h0.c.d(iconCompat.f1279b);
                }
                if (i10 == 1) {
                    IconCompat iconCompat2 = this.f1205e;
                    int i11 = iconCompat2.a;
                    if (i11 == -1) {
                        Object obj = iconCompat2.f1279b;
                        if (obj instanceof Bitmap) {
                            a = (Bitmap) obj;
                        } else {
                            a = null;
                        }
                    } else if (i11 == 1) {
                        a = (Bitmap) iconCompat2.f1279b;
                    } else if (i11 == 5) {
                        a = IconCompat.a((Bitmap) iconCompat2.f1279b, true);
                    } else {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bigContentTitle = bigContentTitle.bigPicture(a);
                }
            }
        }
        if (this.f1207g) {
            IconCompat iconCompat3 = this.f1206f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                j0.a(bigContentTitle, h0.c.g(iconCompat3, context));
            }
        }
        if (this.a) {
            bigContentTitle.setSummaryText((CharSequence) this.f1251d);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            k0.c(bigContentTitle, false);
            k0.b(bigContentTitle, null);
        }
    }

    @Override // androidx.core.app.t0
    public final String d() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
