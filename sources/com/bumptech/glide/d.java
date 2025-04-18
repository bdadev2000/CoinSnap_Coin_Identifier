package com.bumptech.glide;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.inputmethod.EditorInfo;
import android.widget.Toast;
import androidx.fragment.app.z;
import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.plantcare.ai.identifier.plantid.R;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import n9.h0;
import n9.x;
import org.xmlpull.v1.XmlPullParserException;
import s7.x1;
import yg.c0;
import yg.p;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: e, reason: collision with root package name */
    public static final yg.a f9625e;

    /* renamed from: j, reason: collision with root package name */
    public static final c0 f9630j;
    public static final int[] a = {R.attr.colorPrimary};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f9622b = {R.attr.colorPrimaryVariant};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f9623c = new String[0];

    /* renamed from: d, reason: collision with root package name */
    public static final Type[] f9624d = new Type[0];

    /* renamed from: f, reason: collision with root package name */
    public static final c0 f9626f = new c0(1);

    /* renamed from: g, reason: collision with root package name */
    public static final c0 f9627g = new c0(2);

    /* renamed from: h, reason: collision with root package name */
    public static final c0 f9628h = new c0(3);

    /* renamed from: i, reason: collision with root package name */
    public static final c0 f9629i = new c0(4);

    /* renamed from: k, reason: collision with root package name */
    public static final c0 f9631k = new c0(6);

    /* renamed from: l, reason: collision with root package name */
    public static final c0 f9632l = new c0(7);

    /* renamed from: m, reason: collision with root package name */
    public static final c0 f9633m = new c0(8);

    /* renamed from: n, reason: collision with root package name */
    public static final c0 f9634n = new c0(0);

    static {
        int i10 = 5;
        f9625e = new yg.a(i10);
        f9630j = new c0(i10);
    }

    public static void A(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i10);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i11);
    }

    public static void B(Drawable drawable, int i10) {
        h0.a.g(drawable, i10);
    }

    public static void C(Drawable drawable, ColorStateList colorStateList) {
        h0.a.h(drawable, colorStateList);
    }

    public static void D(Drawable drawable, PorterDuff.Mode mode) {
        h0.a.i(drawable, mode);
    }

    public static final void E(Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Toast.makeText(context, context.getResources().getString(i10), 0).show();
    }

    public static void F(XmlResourceParser xmlResourceParser) {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static File G(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    public static String H(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Bundle I(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(d.class.getClassLoader());
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static boolean J(int i10, int i11, int i12, int i13) {
        return (i12 == 1 || i12 == 2 || (i12 == 4 && i10 != 2)) || (i13 == 1 || i13 == 2 || (i13 == 4 && i11 != 2));
    }

    public static boolean K(int i10, x xVar, boolean z10) {
        if (xVar.f22600c - xVar.f22599b < 7) {
            if (z10) {
                return false;
            }
            throw x1.a("too short header: " + (xVar.f22600c - xVar.f22599b), null);
        }
        if (xVar.v() != i10) {
            if (z10) {
                return false;
            }
            throw x1.a("expected header type " + Integer.toHexString(i10), null);
        }
        if (xVar.v() == 118 && xVar.v() == 111 && xVar.v() == 114 && xVar.v() == 98 && xVar.v() == 105 && xVar.v() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw x1.a("expected characters 'vorbis'", null);
    }

    public static void M(Parcel parcel, Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
    }

    public static File a(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, eb.j.k(str2, ".temp"));
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, Object obj, int i10, int i11) {
        for (Object obj2 : spannableStringBuilder.getSpans(i10, i11, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i10 && spannableStringBuilder.getSpanEnd(obj2) == i11 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i10, i11, 33);
    }

    public static Type c(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                return new uc.a(c(cls.getComponentType()));
            }
            return cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new uc.b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new uc.a(((GenericArrayType) type).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            return new uc.c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
        return type;
    }

    public static void d(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r9.a.C, i10, i11);
        boolean z10 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z10) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                h(context, f9622b, "Theme.MaterialComponents");
            }
        }
        h(context, a, "Theme.AppCompat");
    }

    public static void e(String str, boolean z10) {
        if (!z10) {
            throw x1.a(str, null);
        }
    }

    public static void f(Type type) {
        a6.k.i(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(android.content.Context r4, android.util.AttributeSet r5, int[] r6, int r7, int r8, int... r9) {
        /*
            int[] r0 = r9.a.C
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0, r7, r8)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L12
            r0.recycle()
            return
        L12:
            int r1 = r9.length
            r3 = -1
            if (r1 != 0) goto L1d
            int r4 = r0.getResourceId(r2, r3)
            if (r4 == r3) goto L38
            goto L37
        L1d:
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r6, r7, r8)
            int r5 = r9.length
            r6 = r2
        L23:
            if (r6 >= r5) goto L34
            r7 = r9[r6]
            int r7 = r4.getResourceId(r7, r3)
            if (r7 != r3) goto L31
            r4.recycle()
            goto L38
        L31:
            int r6 = r6 + 1
            goto L23
        L34:
            r4.recycle()
        L37:
            r2 = 1
        L38:
            r0.recycle()
            if (r2 == 0) goto L3e
            return
        L3e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.g(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static void h(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < iArr.length) {
                if (!obtainStyledAttributes.hasValue(i10)) {
                    obtainStyledAttributes.recycle();
                    break;
                }
                i10++;
            } else {
                obtainStyledAttributes.recycle();
                z10 = true;
                break;
            }
        }
        if (z10) {
        } else {
            throw new IllegalArgumentException(com.applovin.impl.mediation.ads.e.f("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    public static AdError i(int i10, String str) {
        return new AdError(i10, str, "com.google.ads.mediation.pangle");
    }

    public static AdError j(int i10, String str) {
        return new AdError(i10, str, "com.pangle.ads");
    }

    public static boolean k(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return k(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        if (Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName())) {
            return true;
        }
        return false;
    }

    public static x.n l(w.e eVar, int i10, ArrayList arrayList, x.n nVar) {
        int i11;
        boolean z10;
        int i12;
        if (i10 == 0) {
            i11 = eVar.f26606n0;
        } else {
            i11 = eVar.f26608o0;
        }
        int i13 = 0;
        if (i11 != -1 && (nVar == null || i11 != nVar.f27289b)) {
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    break;
                }
                x.n nVar2 = (x.n) arrayList.get(i14);
                if (nVar2.f27289b == i11) {
                    if (nVar != null) {
                        nVar.c(i10, nVar2);
                        arrayList.remove(nVar);
                    }
                    nVar = nVar2;
                } else {
                    i14++;
                }
            }
        } else if (i11 != -1) {
            return nVar;
        }
        if (nVar == null) {
            if (eVar instanceof w.k) {
                w.k kVar = (w.k) eVar;
                int i15 = 0;
                while (true) {
                    if (i15 < kVar.f26663r0) {
                        w.e eVar2 = kVar.f26662q0[i15];
                        if ((i10 == 0 && (i12 = eVar2.f26606n0) != -1) || (i10 == 1 && (i12 = eVar2.f26608o0) != -1)) {
                            break;
                        }
                        i15++;
                    } else {
                        i12 = -1;
                        break;
                    }
                }
                if (i12 != -1) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= arrayList.size()) {
                            break;
                        }
                        x.n nVar3 = (x.n) arrayList.get(i16);
                        if (nVar3.f27289b == i12) {
                            nVar = nVar3;
                            break;
                        }
                        i16++;
                    }
                }
            }
            if (nVar == null) {
                nVar = new x.n(i10);
            }
            arrayList.add(nVar);
        }
        ArrayList arrayList2 = nVar.a;
        if (arrayList2.contains(eVar)) {
            z10 = false;
        } else {
            arrayList2.add(eVar);
            z10 = true;
        }
        if (z10) {
            if (eVar instanceof w.i) {
                w.i iVar = (w.i) eVar;
                w.d dVar = iVar.f26659t0;
                if (iVar.f26660u0 == 0) {
                    i13 = 1;
                }
                dVar.c(i13, nVar, arrayList);
            }
            int i17 = nVar.f27289b;
            if (i10 == 0) {
                eVar.f26606n0 = i17;
                eVar.I.c(i10, nVar, arrayList);
                eVar.K.c(i10, nVar, arrayList);
            } else {
                eVar.f26608o0 = i17;
                eVar.J.c(i10, nVar, arrayList);
                eVar.M.c(i10, nVar, arrayList);
                eVar.L.c(i10, nVar, arrayList);
            }
            eVar.P.c(i10, nVar, arrayList);
        }
        return nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0027, code lost:
    
        if (r5 != 17) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m(int r5) {
        /*
            r0 = -1
            if (r5 != r0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            r3 = 0
            r4 = 6
            if (r1 >= r2) goto L15
            switch(r5) {
                case 21: goto L14;
                case 22: goto L12;
                case 23: goto L14;
                case 24: goto L12;
                case 25: goto L10;
                case 26: goto L14;
                case 27: goto L12;
                default: goto Lf;
            }
        Lf:
            goto L15
        L10:
            r5 = r3
            goto L15
        L12:
            r5 = 4
            goto L15
        L14:
            r5 = r4
        L15:
            r2 = 30
            if (r1 >= r2) goto L2e
            r2 = 12
            if (r5 == r2) goto L2c
            r2 = 13
            if (r5 == r2) goto L2a
            r2 = 16
            if (r5 == r2) goto L2c
            r2 = 17
            if (r5 == r2) goto L2f
            goto L2e
        L2a:
            r3 = r4
            goto L2f
        L2c:
            r3 = 1
            goto L2f
        L2e:
            r3 = r5
        L2f:
            r5 = 27
            if (r1 >= r5) goto L3e
            r5 = 7
            if (r3 == r5) goto L3f
            r5 = 8
            if (r3 == r5) goto L3f
            r5 = 9
            if (r3 == r5) goto L3f
        L3e:
            r0 = r3
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.m(int):int");
    }

    public static Type n(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return n(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return n(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Class o(Type type) {
        String name;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            a6.k.i(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) o(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return o(((WildcardType) type).getUpperBounds()[0]);
        }
        if (type == null) {
            name = AbstractJsonLexerKt.NULL;
        } else {
            name = type.getClass().getName();
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
    }

    public static Type p(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        a6.k.i(cls2.isAssignableFrom(cls));
        return z(type, cls, n(type, cls, cls2), new HashMap());
    }

    public static final boolean q(Context context) {
        boolean z10;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (connectivityManager.getActiveNetworkInfo() == null) {
            return false;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }

    public static String r(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                sb2.append(str.charAt(i10));
                if (str2.length() > i10) {
                    sb2.append(str2.charAt(i10));
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    public static TypedArray s(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11, int... iArr2) {
        d(context, attributeSet, i10, i11);
        g(context, attributeSet, iArr, i10, i11, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
    }

    public static f0.e t(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i10;
        boolean z10;
        int i11;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), c0.a.f2516b);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlResourceParser.next() != 3) {
                        F(xmlResourceParser);
                    }
                    return new f0.h(new k0.c(string, w(resourceId, resources), string2, string3), integer, integer2, string4);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlResourceParser.next() != 3) {
                    if (xmlResourceParser.getEventType() == 2) {
                        if (xmlResourceParser.getName().equals("font")) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), c0.a.f2517c);
                            int i12 = 8;
                            if (!obtainAttributes2.hasValue(8)) {
                                i12 = 1;
                            }
                            int i13 = obtainAttributes2.getInt(i12, 400);
                            if (obtainAttributes2.hasValue(6)) {
                                i10 = 6;
                            } else {
                                i10 = 2;
                            }
                            if (1 == obtainAttributes2.getInt(i10, 0)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            int i14 = 9;
                            if (!obtainAttributes2.hasValue(9)) {
                                i14 = 3;
                            }
                            int i15 = 7;
                            if (!obtainAttributes2.hasValue(7)) {
                                i15 = 4;
                            }
                            String string5 = obtainAttributes2.getString(i15);
                            int i16 = obtainAttributes2.getInt(i14, 0);
                            if (obtainAttributes2.hasValue(5)) {
                                i11 = 5;
                            } else {
                                i11 = 0;
                            }
                            int resourceId2 = obtainAttributes2.getResourceId(i11, 0);
                            String string6 = obtainAttributes2.getString(i11);
                            obtainAttributes2.recycle();
                            while (xmlResourceParser.next() != 3) {
                                F(xmlResourceParser);
                            }
                            arrayList.add(new f0.g(string6, i13, string5, i16, resourceId2, z10));
                        } else {
                            F(xmlResourceParser);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new f0.f((f0.g[]) arrayList.toArray(new f0.g[0]));
                }
            } else {
                F(xmlResourceParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static l8.b u(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            int i11 = h0.a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                n9.o.f("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(o8.a.a(new x(Base64.decode(split[1], 0))));
                } catch (RuntimeException e2) {
                    n9.o.g("VorbisUtil", "Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new t8.a(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new l8.b(arrayList);
    }

    public static int v(p pVar, String str, int i10, int i11) {
        int r6 = pVar.r();
        if (r6 >= i10 && r6 <= i11) {
            return r6;
        }
        throw new z(String.format("Expected %s but was %s at path %s", str, Integer.valueOf(r6), pVar.z()));
    }

    public static List w(int i10, Resources resources) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (f0.d.a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i10);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static long x(int i10, int i11, x xVar) {
        boolean z10;
        boolean z11;
        xVar.G(i10);
        if (xVar.f22600c - xVar.f22599b < 5) {
            return C.TIME_UNSET;
        }
        int f10 = xVar.f();
        if ((8388608 & f10) != 0 || ((2096896 & f10) >> 8) != i11) {
            return C.TIME_UNSET;
        }
        if ((f10 & 32) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && xVar.v() >= 7 && xVar.f22600c - xVar.f22599b >= 7) {
            if ((xVar.v() & 16) == 16) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                xVar.d(new byte[6], 0, 6);
                return ((r1[3] & 255) << 1) | ((r1[0] & 255) << 25) | ((r1[1] & 255) << 17) | ((r1[2] & 255) << 9) | ((r1[4] & 255) >> 7);
            }
        }
        return C.TIME_UNSET;
    }

    public static f0.c y(x xVar, boolean z10, boolean z11) {
        if (z10) {
            K(3, xVar, false);
        }
        String s5 = xVar.s((int) xVar.l());
        int length = s5.length() + 11;
        long l10 = xVar.l();
        String[] strArr = new String[(int) l10];
        int i10 = length + 4;
        for (int i11 = 0; i11 < l10; i11++) {
            String s10 = xVar.s((int) xVar.l());
            strArr[i11] = s10;
            i10 = i10 + 4 + s10.length();
        }
        if (z11 && (xVar.v() & 1) == 0) {
            throw x1.a("framing bit expected to be set", null);
        }
        return new f0.c(i10 + 1, s5, strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x013f, code lost:
    
        if (r1 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0141, code lost:
    
        r12.put(r1, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0144, code lost:
    
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013f A[EDGE_INSN: B:24:0x013f->B:25:0x013f BREAK  A[LOOP:0: B:2:0x0002->B:29:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[LOOP:0: B:2:0x0002->B:29:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.reflect.Type, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3, types: [uc.c] */
    /* JADX WARN: Type inference failed for: r11v4, types: [uc.c] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Type z(java.lang.reflect.Type r9, java.lang.Class r10, java.lang.reflect.Type r11, java.util.HashMap r12) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.z(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.HashMap):java.lang.reflect.Type");
    }

    public abstract void L(byte[] bArr, int i10, int i11);
}
