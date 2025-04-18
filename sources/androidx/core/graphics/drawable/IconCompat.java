package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Parcelable;
import androidx.core.view.ViewCompat;
import androidx.versionedparcelable.CustomVersionedParcelable;
import h0.c;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f1278k = PorterDuff.Mode.SRC_IN;
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1279b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f1280c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f1281d;

    /* renamed from: e, reason: collision with root package name */
    public int f1282e;

    /* renamed from: f, reason: collision with root package name */
    public int f1283f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f1284g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1285h;

    /* renamed from: i, reason: collision with root package name */
    public String f1286i;

    /* renamed from: j, reason: collision with root package name */
    public String f1287j;

    public IconCompat() {
        this.a = -1;
        this.f1280c = null;
        this.f1281d = null;
        this.f1282e = 0;
        this.f1283f = 0;
        this.f1284g = null;
        this.f1285h = f1278k;
        this.f1286i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z10) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(String str, int i10) {
        str.getClass();
        if (i10 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f1282e = i10;
            iconCompat.f1279b = str;
            iconCompat.f1287j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final int c() {
        int i10 = this.a;
        if (i10 == -1) {
            return c.b(this.f1279b);
        }
        if (i10 == 2) {
            return this.f1282e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final Uri d() {
        int i10 = this.a;
        if (i10 == -1) {
            return c.e(this.f1279b);
        }
        if (i10 != 4 && i10 != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.f1279b);
    }

    public final String toString() {
        String str;
        if (this.a == -1) {
            return String.valueOf(this.f1279b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f1279b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f1279b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f1287j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f1282e);
                if (this.f1283f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f1283f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f1279b);
                break;
        }
        if (this.f1284g != null) {
            sb2.append(" tint=");
            sb2.append(this.f1284g);
        }
        if (this.f1285h != f1278k) {
            sb2.append(" mode=");
            sb2.append(this.f1285h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i10) {
        this.f1280c = null;
        this.f1281d = null;
        this.f1282e = 0;
        this.f1283f = 0;
        this.f1284g = null;
        this.f1285h = f1278k;
        this.f1286i = null;
        this.a = i10;
    }
}
