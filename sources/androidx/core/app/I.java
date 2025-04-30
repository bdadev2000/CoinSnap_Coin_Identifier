package androidx.core.app;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class I extends B1.f {

    /* renamed from: d, reason: collision with root package name */
    public IconCompat f4362d;

    /* renamed from: f, reason: collision with root package name */
    public IconCompat f4363f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4364g;

    @Override // B1.f
    public final void e(b1.h hVar) {
        Bitmap a6;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) hVar.f5270c).setBigContentTitle(null);
        IconCompat iconCompat = this.f4362d;
        Context context = (Context) hVar.b;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                H.a(bigContentTitle, M.c.g(iconCompat, context));
            } else {
                int i9 = iconCompat.f4455a;
                if (i9 == -1) {
                    i9 = M.c.d(iconCompat.b);
                }
                if (i9 == 1) {
                    IconCompat iconCompat2 = this.f4362d;
                    int i10 = iconCompat2.f4455a;
                    if (i10 == -1) {
                        Object obj = iconCompat2.b;
                        if (obj instanceof Bitmap) {
                            a6 = (Bitmap) obj;
                        } else {
                            a6 = null;
                        }
                    } else if (i10 == 1) {
                        a6 = (Bitmap) iconCompat2.b;
                    } else if (i10 == 5) {
                        a6 = IconCompat.a((Bitmap) iconCompat2.b, true);
                    } else {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bigContentTitle = bigContentTitle.bigPicture(a6);
                }
            }
        }
        if (this.f4364g) {
            IconCompat iconCompat3 = this.f4363f;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                G.a(bigContentTitle, M.c.g(iconCompat3, context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            H.c(bigContentTitle, false);
            H.b(bigContentTitle, null);
        }
    }

    @Override // B1.f
    public final String k() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
