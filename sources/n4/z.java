package n4;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import g4.g0;
import java.io.File;

/* loaded from: classes.dex */
public final class z implements g0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22457b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22458c;

    public /* synthetic */ z(Object obj, int i10) {
        this.f22457b = i10;
        this.f22458c = obj;
    }

    @Override // g4.g0
    public final void a() {
        switch (this.f22457b) {
            case 2:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) this.f22458c;
                animatedImageDrawable.stop();
                animatedImageDrawable.clearAnimationCallbacks();
                return;
            default:
                return;
        }
    }

    @Override // g4.g0
    public final Class c() {
        switch (this.f22457b) {
            case 0:
                return Bitmap.class;
            case 1:
                return byte[].class;
            case 2:
                return Drawable.class;
            default:
                return this.f22458c.getClass();
        }
    }

    @Override // g4.g0
    public final Object get() {
        int i10 = this.f22457b;
        Object obj = this.f22458c;
        switch (i10) {
            case 0:
                return (Bitmap) obj;
            case 1:
                return (byte[]) obj;
            case 2:
                return (AnimatedImageDrawable) obj;
            default:
                return obj;
        }
    }

    @Override // g4.g0
    public final int getSize() {
        int intrinsicWidth;
        int intrinsicHeight;
        int i10 = 1;
        int i11 = this.f22457b;
        Object obj = this.f22458c;
        switch (i11) {
            case 0:
                return w4.m.c((Bitmap) obj);
            case 1:
                return ((byte[]) obj).length;
            case 2:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) obj;
                intrinsicWidth = animatedImageDrawable.getIntrinsicWidth();
                intrinsicHeight = animatedImageDrawable.getIntrinsicHeight();
                int i12 = intrinsicHeight * intrinsicWidth;
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                char[] cArr = w4.m.a;
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                int i13 = w4.l.a[config.ordinal()];
                if (i13 != 1) {
                    if (i13 != 2 && i13 != 3) {
                        i10 = 4;
                        if (i13 == 4) {
                            i10 = 8;
                        }
                    } else {
                        i10 = 2;
                    }
                }
                return i10 * i12 * 2;
            default:
                return 1;
        }
    }

    public z(byte[] bArr) {
        this.f22457b = 1;
        com.bumptech.glide.c.l(bArr);
        this.f22458c = bArr;
    }

    public z(File file) {
        this.f22457b = 3;
        com.bumptech.glide.c.l(file);
        this.f22458c = file;
    }
}
