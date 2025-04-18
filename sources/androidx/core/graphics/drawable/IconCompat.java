package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.facebook.internal.security.CertificateUtil;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f18555k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f18556a;

    /* renamed from: b, reason: collision with root package name */
    public Object f18557b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f18558c;
    public Parcelable d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f18559f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f18560g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f18561h;

    /* renamed from: i, reason: collision with root package name */
    public String f18562i;

    /* renamed from: j, reason: collision with root package name */
    public String f18563j;

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api23Impl {
        public static IconCompat a(Object obj) {
            obj.getClass();
            int d = d(obj);
            if (d == 2) {
                return IconCompat.c(null, c(obj), b(obj));
            }
            if (d == 4) {
                Uri e = e(obj);
                PorterDuff.Mode mode = IconCompat.f18555k;
                e.getClass();
                String uri = e.toString();
                uri.getClass();
                IconCompat iconCompat = new IconCompat(4);
                iconCompat.f18557b = uri;
                return iconCompat;
            }
            if (d != 6) {
                IconCompat iconCompat2 = new IconCompat(-1);
                iconCompat2.f18557b = obj;
                return iconCompat2;
            }
            Uri e2 = e(obj);
            PorterDuff.Mode mode2 = IconCompat.f18555k;
            e2.getClass();
            String uri2 = e2.toString();
            uri2.getClass();
            IconCompat iconCompat3 = new IconCompat(6);
            iconCompat3.f18557b = uri2;
            return iconCompat3;
        }

        public static int b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon resource", e);
                return 0;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon resource", e2);
                return 0;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            }
        }

        public static String c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon package", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon package", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            }
        }

        public static int d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e);
                return -1;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e2);
                return -1;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                return -1;
            }
        }

        @Nullable
        @DoNotInline
        public static Uri e(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon uri", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon uri", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon uri", e3);
                return null;
            }
        }

        @DoNotInline
        public static Drawable f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
        @androidx.annotation.DoNotInline
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static android.graphics.drawable.Icon g(androidx.core.graphics.drawable.IconCompat r4, android.content.Context r5) {
            /*
                Method dump skipped, instructions count: 272
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.Api23Impl.g(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api26Impl {
        @DoNotInline
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        @DoNotInline
        public static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api28Impl {
        @DoNotInline
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        @DoNotInline
        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        @DoNotInline
        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        @DoNotInline
        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api30Impl {
        @DoNotInline
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface IconType {
    }

    @RestrictTo
    public IconCompat() {
        this.f18556a = -1;
        this.f18558c = null;
        this.d = null;
        this.e = 0;
        this.f18559f = 0;
        this.f18560g = null;
        this.f18561h = f18555k;
        this.f18562i = null;
    }

    public static IconCompat a(Icon icon) {
        return Api23Impl.a(icon);
    }

    public static IconCompat b(Icon icon) {
        if (Api23Impl.d(icon) == 2 && Api23Impl.b(icon) == 0) {
            return null;
        }
        return Api23Impl.a(icon);
    }

    public static IconCompat c(Resources resources, String str, int i2) {
        str.getClass();
        if (i2 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.e = i2;
        if (resources != null) {
            try {
                iconCompat.f18557b = resources.getResourceName(i2);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f18557b = str;
        }
        iconCompat.f18563j = str;
        return iconCompat;
    }

    public final int d() {
        int i2 = this.f18556a;
        if (i2 == -1) {
            return Api23Impl.b(this.f18557b);
        }
        if (i2 == 2) {
            return this.e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final String e() {
        int i2 = this.f18556a;
        if (i2 == -1) {
            return Api23Impl.c(this.f18557b);
        }
        if (i2 == 2) {
            String str = this.f18563j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f18557b).split(CertificateUtil.DELIMITER, -1)[0] : this.f18563j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public final int f() {
        int i2 = this.f18556a;
        return i2 == -1 ? Api23Impl.d(this.f18557b) : i2;
    }

    public final Uri g() {
        int i2 = this.f18556a;
        if (i2 == -1) {
            return Api23Impl.e(this.f18557b);
        }
        if (i2 == 4 || i2 == 6) {
            return Uri.parse((String) this.f18557b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final Icon h() {
        return Api23Impl.g(this, null);
    }

    public final Icon i(Context context) {
        return Api23Impl.g(this, context);
    }

    public final String toString() {
        String str;
        if (this.f18556a == -1) {
            return String.valueOf(this.f18557b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f18556a) {
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
        switch (this.f18556a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f18557b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f18557b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f18563j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(d())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.e);
                if (this.f18559f != 0) {
                    sb.append(" off=");
                    sb.append(this.f18559f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f18557b);
                break;
        }
        if (this.f18560g != null) {
            sb.append(" tint=");
            sb.append(this.f18560g);
        }
        if (this.f18561h != f18555k) {
            sb.append(" mode=");
            sb.append(this.f18561h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i2) {
        this.f18558c = null;
        this.d = null;
        this.e = 0;
        this.f18559f = 0;
        this.f18560g = null;
        this.f18561h = f18555k;
        this.f18562i = null;
        this.f18556a = i2;
    }
}
