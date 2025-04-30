package M0;

import Q7.C0238f;
import a.AbstractC0325a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.facebook.C0785a;
import com.facebook.C1829g;
import com.facebook.C1849l;
import com.facebook.EnumC1828f;
import com.google.android.gms.tasks.Task;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import e8.T;
import e8.k0;
import g4.AbstractC2292b;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.CancellationException;
import o6.C2511a;
import org.json.JSONException;
import org.json.JSONObject;
import p5.C2565p;
import u7.AbstractC2817h;

/* renamed from: M0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0219j {
    public static final e8.F a(a8.b bVar) {
        return new e8.F(k0.f20172a, bVar, 1);
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static final void c(TextView textView, C2511a c2511a) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        G7.j.e(textView, "<this>");
        G7.j.e(c2511a, "vectorTextViewParams");
        Integer num = c2511a.f22001r;
        Drawable drawable4 = null;
        Integer num2 = c2511a.m;
        if (num2 == null) {
            Integer num3 = c2511a.f22000q;
            if (num3 != null) {
                num2 = Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(num3.intValue()));
            } else {
                num2 = null;
            }
            if (num2 == null) {
                if (num != null) {
                    num2 = Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(num.intValue()));
                } else {
                    num2 = null;
                }
            }
        }
        Integer num4 = c2511a.l;
        if (num4 == null) {
            Integer num5 = c2511a.f21999p;
            if (num5 != null) {
                num4 = Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(num5.intValue()));
            } else {
                num4 = null;
            }
            if (num4 == null) {
                if (num != null) {
                    num4 = Integer.valueOf(textView.getContext().getResources().getDimensionPixelSize(num.intValue()));
                } else {
                    num4 = null;
                }
            }
        }
        Drawable drawable5 = c2511a.f21990e;
        if (drawable5 == null) {
            Integer num6 = c2511a.f21987a;
            if (num6 != null) {
                drawable5 = com.facebook.appevents.n.g(textView.getContext(), num6.intValue());
            } else {
                drawable5 = null;
            }
        }
        Integer num7 = c2511a.f21998o;
        if (drawable5 != null) {
            Context context = textView.getContext();
            G7.j.d(context, "getContext(...)");
            drawable = AbstractC2292b.i(drawable5, context, num4, num2);
            AbstractC2292b.p(drawable, num7);
        } else {
            drawable = null;
        }
        Drawable drawable6 = c2511a.f21991f;
        if (drawable6 == null) {
            Integer num8 = c2511a.b;
            if (num8 != null) {
                drawable6 = com.facebook.appevents.n.g(textView.getContext(), num8.intValue());
            } else {
                drawable6 = null;
            }
        }
        if (drawable6 != null) {
            Context context2 = textView.getContext();
            G7.j.d(context2, "getContext(...)");
            drawable2 = AbstractC2292b.i(drawable6, context2, num4, num2);
            AbstractC2292b.p(drawable2, num7);
        } else {
            drawable2 = null;
        }
        Drawable drawable7 = c2511a.f21992g;
        if (drawable7 == null) {
            Integer num9 = c2511a.f21988c;
            if (num9 != null) {
                drawable7 = com.facebook.appevents.n.g(textView.getContext(), num9.intValue());
            } else {
                drawable7 = null;
            }
        }
        if (drawable7 != null) {
            Context context3 = textView.getContext();
            G7.j.d(context3, "getContext(...)");
            drawable3 = AbstractC2292b.i(drawable7, context3, num4, num2);
            AbstractC2292b.p(drawable3, num7);
        } else {
            drawable3 = null;
        }
        Drawable drawable8 = c2511a.f21993h;
        if (drawable8 == null) {
            Integer num10 = c2511a.f21989d;
            if (num10 != null) {
                drawable8 = com.facebook.appevents.n.g(textView.getContext(), num10.intValue());
            } else {
                drawable8 = null;
            }
        }
        if (drawable8 != null) {
            Context context4 = textView.getContext();
            G7.j.d(context4, "getContext(...)");
            drawable4 = AbstractC2292b.i(drawable8, context4, num4, num2);
            AbstractC2292b.p(drawable4, num7);
        }
        if (c2511a.f21994i) {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable4, drawable, drawable3);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable4, drawable2, drawable3);
        }
        Integer num11 = c2511a.f21996k;
        if (num11 != null) {
            textView.setCompoundDrawablePadding(num11.intValue());
        } else {
            Integer num12 = c2511a.f21997n;
            if (num12 != null) {
                textView.setCompoundDrawablePadding(textView.getContext().getResources().getDimensionPixelSize(num12.intValue()));
            }
        }
        textView.setContentDescription(c2511a.f21995j);
    }

    public static void d(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                M.a.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            } else {
                M.a.h(drawable, colorStateList);
            }
            if (mode != null) {
                M.a.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final void e(TextView textView, j6.x xVar) {
        G7.j.e(xVar, "textForm");
        CharSequence charSequence = xVar.f21205a;
        boolean z8 = xVar.f21207d;
        if (z8) {
            charSequence = Html.fromHtml(charSequence.toString(), 0);
        } else if (z8) {
            throw new RuntimeException();
        }
        textView.setText(charSequence);
        textView.setTextSize(xVar.b);
        textView.setGravity(xVar.f21212i);
        textView.setTextColor(xVar.f21206c);
        textView.setIncludeFontPadding(true);
        Float f9 = xVar.f21210g;
        if (f9 != null) {
            textView.setLineSpacing(f9.floatValue(), 1.0f);
        }
        Float f10 = xVar.f21211h;
        if (f10 != null) {
            textView.setLetterSpacing(f10.floatValue());
        }
        Typeface typeface = xVar.f21209f;
        if (typeface != null) {
            textView.setTypeface(typeface);
        } else {
            textView.setTypeface(textView.getTypeface(), xVar.f21208e);
        }
    }

    public static final Object f(Task task, C2565p c2565p) {
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception == null) {
                if (!task.isCanceled()) {
                    return task.getResult();
                }
                throw new CancellationException("Task " + task + " was cancelled normally.");
            }
            throw exception;
        }
        C0238f c0238f = new C0238f(1, F2.h.x(c2565p));
        c0238f.t();
        task.addOnCompleteListener(Z7.a.b, new E1.c(c0238f, 25));
        return c0238f.s();
    }

    public static w8.c g() {
        w8.c cVar = w8.c.f24009j;
        G7.j.b(cVar);
        w8.c cVar2 = cVar.f24011f;
        if (cVar2 == null) {
            long nanoTime = System.nanoTime();
            w8.c.class.wait(w8.c.f24007h);
            w8.c cVar3 = w8.c.f24009j;
            G7.j.b(cVar3);
            if (cVar3.f24011f != null || System.nanoTime() - nanoTime < w8.c.f24008i) {
                return null;
            }
            return w8.c.f24009j;
        }
        long nanoTime2 = cVar2.f24012g - System.nanoTime();
        if (nanoTime2 > 0) {
            long j7 = nanoTime2 / 1000000;
            w8.c.class.wait(j7, (int) (nanoTime2 - (1000000 * j7)));
            return null;
        }
        w8.c cVar4 = w8.c.f24009j;
        G7.j.b(cVar4);
        cVar4.f24011f = cVar2.f24011f;
        cVar2.f24011f = null;
        return cVar2;
    }

    public static void h(String str) {
        if (str.length() > 0) {
            int length = str.length();
            int i9 = 0;
            while (i9 < length) {
                int i10 = i9 + 1;
                char charAt = str.charAt(i9);
                if ('!' <= charAt && charAt < 127) {
                    i9 = i10;
                } else {
                    throw new IllegalArgumentException(j8.b.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i9), str).toString());
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty".toString());
    }

    public static void i(Object obj) {
        if (obj != null) {
        } else {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static void j(String str, String str2) {
        String j7;
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            int i10 = i9 + 1;
            char charAt = str.charAt(i9);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                String h6 = j8.b.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i9), str2);
                if (j8.b.p(str2)) {
                    j7 = "";
                } else {
                    j7 = G7.j.j(str, ": ");
                }
                throw new IllegalArgumentException(G7.j.j(j7, h6).toString());
            }
            i9 = i10;
        }
    }

    public static ImageView.ScaleType k(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 5) {
                            if (i9 != 6) {
                                return ImageView.ScaleType.CENTER;
                            }
                            return ImageView.ScaleType.CENTER_INSIDE;
                        }
                        return ImageView.ScaleType.CENTER_CROP;
                    }
                    return ImageView.ScaleType.FIT_END;
                }
                return ImageView.ScaleType.FIT_CENTER;
            }
            return ImageView.ScaleType.FIT_START;
        }
        return ImageView.ScaleType.FIT_XY;
    }

    public static C0785a l(Bundle bundle, String str) {
        String string;
        EnumC1828f enumC1828f = EnumC1828f.FACEBOOK_APPLICATION_SERVICE;
        G7.j.e(bundle, "bundle");
        G7.j.e(str, "applicationId");
        Date m = com.facebook.internal.H.m(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date m2 = com.facebook.internal.H.m(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
        if (string2 == null || string2.length() == 0 || (string = bundle.getString("com.facebook.platform.extra.USER_ID")) == null || string.length() == 0) {
            return null;
        }
        return new C0785a(string2, str, string, stringArrayList, null, null, enumC1828f, m, new Date(), m2, bundle.getString("graph_domain"));
    }

    public static C0785a m(Collection collection, Bundle bundle, EnumC1828f enumC1828f, String str) {
        Collection collection2;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object[] array;
        G7.j.e(bundle, "bundle");
        G7.j.e(str, "applicationId");
        Date m = com.facebook.internal.H.m(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        if (string == null) {
            return null;
        }
        Date m2 = com.facebook.internal.H.m(bundle, "data_access_expiration_time", new Date(0L));
        String string2 = bundle.getString("granted_scopes");
        if (string2 != null && string2.length() > 0) {
            Object[] array2 = O7.g.V(string2, new String[]{","}, 0, 6).toArray(new String[0]);
            if (array2 != null) {
                String[] strArr = (String[]) array2;
                collection2 = AbstractC2817h.y(Arrays.copyOf(strArr, strArr.length));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            collection2 = collection;
        }
        String string3 = bundle.getString("denied_scopes");
        if (string3 != null && string3.length() > 0) {
            Object[] array3 = O7.g.V(string3, new String[]{","}, 0, 6).toArray(new String[0]);
            if (array3 != null) {
                String[] strArr2 = (String[]) array3;
                arrayList = AbstractC2817h.y(Arrays.copyOf(strArr2, strArr2.length));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            arrayList = null;
        }
        String string4 = bundle.getString("expired_scopes");
        if (string4 != null && string4.length() > 0) {
            Object[] array4 = O7.g.V(string4, new String[]{","}, 0, 6).toArray(new String[0]);
            if (array4 != null) {
                String[] strArr3 = (String[]) array4;
                arrayList2 = AbstractC2817h.y(Arrays.copyOf(strArr3, strArr3.length));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            arrayList2 = null;
        }
        if (com.facebook.internal.H.B(string)) {
            return null;
        }
        String string5 = bundle.getString("graph_domain");
        String string6 = bundle.getString("signed_request");
        if (string6 != null && string6.length() != 0) {
            try {
                array = O7.g.V(string6, new String[]{"."}, 0, 6).toArray(new String[0]);
            } catch (UnsupportedEncodingException | JSONException unused) {
            }
            if (array != null) {
                String[] strArr4 = (String[]) array;
                if (strArr4.length == 2) {
                    byte[] decode = Base64.decode(strArr4[1], 0);
                    G7.j.d(decode, DataSchemeDataSource.SCHEME_DATA);
                    String string7 = new JSONObject(new String(decode, O7.a.f2244a)).getString("user_id");
                    G7.j.d(string7, "jsonObject.getString(\"user_id\")");
                    return new C0785a(string, str, string7, collection2, arrayList, arrayList2, enumC1828f, m, new Date(), m2, string5);
                }
                throw new C1849l("Failed to retrieve user_id from signed_request");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new C1849l("Authorization response does not contain the signed_request");
    }

    public static C1829g n(Bundle bundle, String str) {
        G7.j.e(bundle, "bundle");
        String string = bundle.getString("id_token");
        if (string != null && string.length() != 0 && str != null && str.length() != 0) {
            try {
                return new C1829g(string, str);
            } catch (Exception e4) {
                throw new RuntimeException(e4.getMessage(), e4);
            }
        }
        return null;
    }

    public static View o(View view, int i9) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View findViewById = viewGroup.getChildAt(i10).findViewById(i9);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static int p(Context context, int i9, int i10) {
        Integer num;
        int i11;
        TypedValue n2 = AbstractC0325a.n(context, i9);
        if (n2 != null) {
            int i12 = n2.resourceId;
            if (i12 != 0) {
                i11 = I.h.getColor(context, i12);
            } else {
                i11 = n2.data;
            }
            num = Integer.valueOf(i11);
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return i10;
    }

    public static int q(View view, int i9) {
        Context context = view.getContext();
        TypedValue p2 = AbstractC0325a.p(view.getContext(), i9, view.getClass().getCanonicalName());
        int i10 = p2.resourceId;
        if (i10 != 0) {
            return I.h.getColor(context, i10);
        }
        return p2.data;
    }

    public static final a8.b r(a8.b bVar) {
        G7.j.e(bVar, "<this>");
        if (!bVar.getDescriptor().c()) {
            return new T(bVar);
        }
        return bVar;
    }

    public static boolean s(int i9) {
        boolean z8;
        double pow;
        double pow2;
        double pow3;
        if (i9 != 0) {
            ThreadLocal threadLocal = L.c.f1667a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i9);
            int green = Color.green(i9);
            int blue = Color.blue(i9);
            if (dArr.length == 3) {
                double d2 = red / 255.0d;
                if (d2 < 0.04045d) {
                    pow = d2 / 12.92d;
                } else {
                    pow = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
                }
                double d9 = green / 255.0d;
                if (d9 < 0.04045d) {
                    pow2 = d9 / 12.92d;
                } else {
                    pow2 = Math.pow((d9 + 0.055d) / 1.055d, 2.4d);
                }
                double d10 = blue / 255.0d;
                if (d10 < 0.04045d) {
                    pow3 = d10 / 12.92d;
                } else {
                    pow3 = Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
                }
                z8 = false;
                dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                double d11 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr[1] = d11;
                dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (d11 / 100.0d > 0.5d) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
        } else {
            z8 = false;
        }
        return z8;
    }

    public static boolean t() {
        return r8.d.f22934d;
    }

    public static int u(float f9, int i9, int i10) {
        return L.c.b(L.c.d(i10, Math.round(Color.alpha(i10) * f9)), i9);
    }

    public static i8.s v(String... strArr) {
        if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i9 = 0;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                String str = strArr2[i10];
                if (str != null) {
                    strArr2[i10] = O7.g.a0(str).toString();
                    i10 = i11;
                } else {
                    throw new IllegalArgumentException("Headers cannot be null".toString());
                }
            }
            int p2 = R2.b.p(0, strArr2.length - 1, 2);
            if (p2 >= 0) {
                while (true) {
                    int i12 = i9 + 2;
                    String str2 = strArr2[i9];
                    String str3 = strArr2[i9 + 1];
                    h(str2);
                    j(str3, str2);
                    if (i9 == p2) {
                        break;
                    }
                    i9 = i12;
                }
            }
            return new i8.s(strArr2);
        }
        throw new IllegalArgumentException("Expected alternating header names and values".toString());
    }

    public static void w(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            M.a.h(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static void x(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z8;
        boolean hasOnClickListeners = ViewCompat.hasOnClickListeners(checkableImageButton);
        boolean z9 = false;
        int i9 = 1;
        if (onLongClickListener != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (hasOnClickListeners || z8) {
            z9 = true;
        }
        checkableImageButton.setFocusable(z9);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z8);
        if (!z9) {
            i9 = 2;
        }
        ViewCompat.setImportantForAccessibility(checkableImageButton, i9);
    }
}
