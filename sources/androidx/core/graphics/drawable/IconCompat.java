package androidx.core.graphics.drawable;

import M.c;
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

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f4454k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f4455a;
    public Object b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f4456c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f4457d;

    /* renamed from: e, reason: collision with root package name */
    public int f4458e;

    /* renamed from: f, reason: collision with root package name */
    public int f4459f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f4460g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f4461h;

    /* renamed from: i, reason: collision with root package name */
    public String f4462i;

    /* renamed from: j, reason: collision with root package name */
    public String f4463j;

    public IconCompat() {
        this.f4455a = -1;
        this.f4456c = null;
        this.f4457d = null;
        this.f4458e = 0;
        this.f4459f = 0;
        this.f4460g = null;
        this.f4461h = f4454k;
        this.f4462i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z8) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f9 = min;
        float f10 = 0.5f * f9;
        float f11 = 0.9166667f * f10;
        if (z8) {
            float f12 = 0.010416667f * f9;
            paint.setColor(0);
            paint.setShadowLayer(f12, 0.0f, f9 * 0.020833334f, 1023410176);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.setShadowLayer(f12, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f10, f10, f11, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(int i9, String str) {
        str.getClass();
        if (i9 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f4458e = i9;
            iconCompat.b = str;
            iconCompat.f4463j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final int c() {
        int i9 = this.f4455a;
        if (i9 == -1) {
            return c.b(this.b);
        }
        if (i9 == 2) {
            return this.f4458e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final Uri d() {
        int i9 = this.f4455a;
        if (i9 == -1) {
            return c.e(this.b);
        }
        if (i9 != 4 && i9 != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.b);
    }

    public final String toString() {
        String str;
        if (this.f4455a == -1) {
            return String.valueOf(this.b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f4455a) {
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
        sb.append(str);
        switch (this.f4455a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f4463j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f4458e);
                if (this.f4459f != 0) {
                    sb.append(" off=");
                    sb.append(this.f4459f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.b);
                break;
        }
        if (this.f4460g != null) {
            sb.append(" tint=");
            sb.append(this.f4460g);
        }
        if (this.f4461h != f4454k) {
            sb.append(" mode=");
            sb.append(this.f4461h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i9) {
        this.f4456c = null;
        this.f4457d = null;
        this.f4458e = 0;
        this.f4459f = 0;
        this.f4460g = null;
        this.f4461h = f4454k;
        this.f4462i = null;
        this.f4455a = i9;
    }
}
