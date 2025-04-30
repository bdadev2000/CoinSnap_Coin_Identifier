package g4;

import G7.j;
import Z.m;
import Z.n;
import Z.o;
import Z.q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Size;
import android.util.SizeF;
import android.view.ActionMode;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.adjust.sdk.Util;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.io.Serializable;
import t7.C2720i;
import w7.k;
import w7.l;

/* renamed from: g4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2292b {

    /* renamed from: a, reason: collision with root package name */
    public static int f20428a = 2;

    public static int a(String str, int i9) {
        return (Util.hashString(str) + i9) * 37;
    }

    public static final Bundle b(C2720i... c2720iArr) {
        Bundle bundle = new Bundle(c2720iArr.length);
        for (C2720i c2720i : c2720iArr) {
            String str = (String) c2720i.b;
            Object obj = c2720i.f23021c;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                j.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) obj);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                P.c.a(bundle, str, (Size) obj);
            } else if (obj instanceof SizeF) {
                P.c.b(bundle, str, (SizeF) obj);
            } else {
                throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static i8.r c(javax.net.ssl.SSLSession r6) {
        /*
            u7.o r0 = u7.C2824o.b
            java.lang.String r1 = r6.getCipherSuite()
            if (r1 == 0) goto L7e
            java.lang.String r2 = "TLS_NULL_WITH_NULL_NULL"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L12
            r2 = 1
            goto L18
        L12:
            java.lang.String r2 = "SSL_NULL_WITH_NULL_NULL"
            boolean r2 = r1.equals(r2)
        L18:
            if (r2 != 0) goto L72
            i8.b r2 = i8.C2377n.b
            i8.n r1 = r2.c(r1)
            java.lang.String r2 = r6.getProtocol()
            if (r2 == 0) goto L66
            java.lang.String r3 = "NONE"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L5e
            i8.O r2 = y2.AbstractC2947c.j(r2)
            java.security.cert.Certificate[] r3 = r6.getPeerCertificates()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L42
            if (r3 == 0) goto L42
            int r4 = r3.length     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L42
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L42
            java.util.List r3 = j8.b.k(r3)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L42
            goto L43
        L42:
            r3 = r0
        L43:
            i8.r r4 = new i8.r
            java.security.cert.Certificate[] r6 = r6.getLocalCertificates()
            if (r6 == 0) goto L54
            int r0 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            java.util.List r0 = j8.b.k(r6)
        L54:
            i8.q r6 = new i8.q
            r5 = 1
            r6.<init>(r3, r5)
            r4.<init>(r2, r1, r0, r6)
            return r4
        L5e:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "tlsVersion == NONE"
            r6.<init>(r0)
            throw r6
        L66:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "tlsVersion == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L72:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "cipherSuite == "
            java.lang.String r0 = G7.j.j(r1, r0)
            r6.<init>(r0)
            throw r6
        L7e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "cipherSuite == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.AbstractC2292b.c(javax.net.ssl.SSLSession):i8.r");
    }

    public static w7.i d(w7.i iVar, w7.j jVar) {
        j.e(jVar, "key");
        if (!j.a(iVar.getKey(), jVar)) {
            return null;
        }
        return iVar;
    }

    public static R.d e(TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 28) {
            return new R.d(o.c(textView));
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int a6 = m.a(textView);
        int d2 = m.d(textView);
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z8 = true;
            if (i9 >= 28 && (textView.getInputType() & 15) == 3) {
                byte directionality = Character.getDirectionality(o.b(n.a(textView.getTextLocale()))[0].codePointAt(0));
                if (directionality != 1 && directionality != 2) {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                } else {
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                }
            } else {
                if (textView.getLayoutDirection() != 1) {
                    z8 = false;
                }
                switch (textView.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z8) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        } else {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            break;
                        }
                }
            }
        }
        return new R.d(textPaint, textDirectionHeuristic, a6, d2);
    }

    public static boolean f(EditText editText) {
        if (editText.getInputType() != 0) {
            return true;
        }
        return false;
    }

    public static k g(w7.i iVar, w7.j jVar) {
        j.e(jVar, "key");
        if (j.a(iVar.getKey(), jVar)) {
            return l.b;
        }
        return iVar;
    }

    public static final /* synthetic */ Drawable i(Drawable drawable, Context context, Integer num, Integer num2) {
        if (num != null && num2 != null) {
            Bitmap createBitmap = Bitmap.createBitmap(num.intValue(), num2.intValue(), Bitmap.Config.ARGB_8888);
            j.d(createBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, num.intValue(), num2.intValue());
            drawable.draw(canvas);
            return new BitmapDrawable(context.getResources(), createBitmap);
        }
        return drawable;
    }

    public static final void j(View view, G0.g gVar) {
        j.e(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, gVar);
    }

    public static void k(TextView textView, int i9) {
        int i10;
        C2.m.f(i9);
        if (Build.VERSION.SDK_INT >= 28) {
            o.d(textView, i9);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i10 = fontMetricsInt.top;
        } else {
            i10 = fontMetricsInt.ascent;
        }
        if (i9 > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), i9 + i10, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0154, code lost:
    
        r14 = com.facebook.internal.H.F(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x015c, code lost:
    
        if (O2.a.b(r3) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x015f, code lost:
    
        com.facebook.r.c().execute(new I2.g(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x016c, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016d, code lost:
    
        O2.a.a(r3, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void l(java.util.HashMap r14) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.AbstractC2292b.l(java.util.HashMap):void");
    }

    public static void m(TextView textView, int i9) {
        int i10;
        C2.m.f(i9);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i10 = fontMetricsInt.bottom;
        } else {
            i10 = fontMetricsInt.descent;
        }
        if (i9 > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i9 - i10);
        }
    }

    public static void n(TextView textView, int i9) {
        C2.m.f(i9);
        if (i9 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i9 - r0, 1.0f);
        }
    }

    public static void o(Drawable drawable, int i9) {
        M.a.g(drawable, i9);
    }

    public static final void p(Drawable drawable, Integer num) {
        if (num != null) {
            M.a.h(drawable, ColorStateList.valueOf(num.intValue()));
        }
    }

    public static ActionMode.Callback q(ActionMode.Callback callback) {
        if ((callback instanceof q) && Build.VERSION.SDK_INT >= 26) {
            return ((q) callback).f3867a;
        }
        return callback;
    }

    public static ActionMode.Callback r(ActionMode.Callback callback, TextView textView) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26 && i9 <= 27 && !(callback instanceof q) && callback != null) {
            return new q(callback, textView);
        }
        return callback;
    }

    public abstract void h();
}
