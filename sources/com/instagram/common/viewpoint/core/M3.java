package com.instagram.common.viewpoint.core;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.text.Layout;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public abstract class M3 {
    public static byte[] A00;
    public static String[] A01 = {"aXQ8cQ350VCAT2mitcvykUGHubvGx6C9", "NAK0YApfoevBcA8nU2", "YHwKc8bJ3fYIczYaga21kucMEh7K8adi", "qYAOAoZ496ND8", "6pHjubFxbGGqNA8P9d", "3r9qhhsI1oDbETggKvxV5tdwn", "sRn13xQSljRP603ULBb8dNJbjS", "vNgqutu69Vtz3tnibxv52jRaXo"};
    public static final int A02;
    public static final int A03;
    public static final ConcurrentHashMap<Integer, Integer> A04;
    public static final AtomicInteger A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Drawable A09(int i2, int i3, int i4, int i5) {
        return Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(ColorStateList.valueOf(i3), A06(i2, i5), A07(i4, i5)) : A0A(i2, i3, i5);
    }

    public static String A0D(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 15);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A00 = new byte[]{120, 118, -127, -127, 122, -121, 105, -114, -123, 122, -35, -26, -29, -35, -27, -39, -19, -23, -17, -20, -35, -33, -124, -121, -118, -110, -125, -112, -125, -126, 125, -127, -118, -121, -127, -119, 125, -126, -125, -118, Byte.MAX_VALUE, -105, 125, -117, -111, -40, -35, -29, -44, -31, -30, -29, -40, -29, -40, -48, -37, -39, -29, -49, -45, -47, -45, -49, -42, -39, -36, -28, -43, -30, -49, -45, -36, -39, -45, -37, -29, -49, -33, -34, -49, -45, -28, -47, -125, -115, 121, 125, -116, Byte.MAX_VALUE, 123, -114, -125, -112, Byte.MAX_VALUE, 121, 123, -115, 121, 125, -114, 123, 121, -112, 76, -90, -103, -85, -107, -90, -104, -103, -104, -109, -86, -99, -104, -103, -93, -50, -53, -66, -53, -48, -53, -119, -55, -63, -64, -59, -47, -55, -11, -29, -16, -11, -81, -11, -25, -12, -21, -24, -81, -17, -25, -26, -21, -9, -17, -36, -43, -48, -40, -36, -52, -80, -53, -66, -68, -82, -69, -84, -75, -78, -84, -76};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static boolean A0g(C1045Zs c1045Zs, EnumC01700g enumC01700g, Map<String, String> map) {
        String str = map.get(A0D(84, 21, 11));
        boolean z2 = str != null && str.equals(Boolean.TRUE.toString());
        if (z2 && (A0f(c1045Zs, enumC01700g) || A0d(enumC01700g, map))) {
            return true;
        }
        String str2 = map.get(A0D(57, 27, 97));
        return z2 && (str2 != null && str2.equals(Boolean.TRUE.toString())) && A0e(enumC01700g, map);
    }

    static {
        A0E();
        A03 = AbstractC02302p.A01(-1, 0);
        A02 = AbstractC02302p.A01(-16777216, Opcodes.DREM);
        A05 = new AtomicInteger(1);
        A04 = new ConcurrentHashMap<>();
    }

    public static int A00() {
        int i2;
        int newValue;
        do {
            i2 = A05.get();
            newValue = i2 + 1;
            if (newValue > 16777215) {
                newValue = 1;
            }
        } while (!A05.compareAndSet(i2, newValue));
        return i2;
    }

    public static int A01(int i2) {
        return (int) TypedValue.applyDimension(2, i2, LP.A03);
    }

    public static int A02(int i2) {
        if (A0c(i2)) {
            return AbstractC02302p.A02(i2, -1, 0.4f);
        }
        return AbstractC02302p.A02(i2, -16777216, 0.2f);
    }

    public static int A03(TextView textView) {
        Layout layout;
        int lineCount;
        if (textView == null || textView.getLayout() == null || (lineCount = (layout = textView.getLayout()).getLineCount()) <= 0) {
            return 0;
        }
        double ellipsisCount = layout.getEllipsisCount(lineCount - 1);
        double ellipsisCount2 = ellipsisCount / (textView.getText().length() - ellipsisCount);
        if (A01[3].length() == 20) {
            throw new RuntimeException();
        }
        A01[3] = "IkK7ljd8WWfE470H6O9Fo";
        return (int) Math.ceil(ellipsisCount2);
    }

    public static int A04(TextView textView, int i2) {
        int lineHeightTitle = A03(textView);
        int lines = 0;
        int extraLinesRequired = textView.getLineHeight();
        while (i2 > extraLinesRequired && lines < lineHeightTitle) {
            lines++;
            i2 -= extraLinesRequired;
        }
        return lines;
    }

    public static Drawable A05(int i2, int i3) {
        return A08(i2, A02(i2), i3);
    }

    public static Drawable A06(int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i2);
        gradientDrawable.setCornerRadius(i3);
        return gradientDrawable;
    }

    public static Drawable A07(int i2, int i3) {
        float[] fArr = new float[8];
        Arrays.fill(fArr, i3);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(i2);
        return shapeDrawable;
    }

    public static Drawable A08(int i2, int i3, int i4) {
        return A09(i2, i3, i2, i4);
    }

    public static StateListDrawable A0A(int i2, int i3, int i4) {
        return A0B(new int[][]{new int[]{R.attr.state_pressed}, new int[0]}, new int[]{i3, i2}, i4);
    }

    public static StateListDrawable A0B(int[][] iArr, int[] iArr2, int i2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        int i3 = 0;
        while (true) {
            int length = iArr.length;
            String[] strArr = A01;
            String str = strArr[7];
            String str2 = strArr[6];
            int i4 = str.length();
            if (i4 != str2.length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "YKf7NEmPl3xejVzEDC";
            strArr2[1] = "WRDdubv1OiIiL9yW5q";
            if (i3 < length) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(iArr2[i3]);
                gradientDrawable.setCornerRadius(i2);
                stateListDrawable.addState(iArr[i3], gradientDrawable);
                i3++;
            } else {
                return stateListDrawable;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.widget.TextView A0C(android.view.ViewGroup r4) {
        /*
            r1 = 0
        L1:
            int r0 = r4.getChildCount()
            if (r1 >= r0) goto L3d
            android.view.View r3 = r4.getChildAt(r1)
            boolean r0 = r3 instanceof android.widget.TextView
            if (r0 == 0) goto L2b
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.M3.A01
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 20
            if (r1 == r0) goto L37
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.M3.A01
            java.lang.String r1 = "6RJtTYzLBnUcHRvsTatmkmWKIun16hlE"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "BwINbhkVgYMYeGJED3O8k6L5SNrYNN6g"
            r0 = 2
            r2[r0] = r1
            return r3
        L2b:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L34
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            A0C(r3)
        L34:
            int r1 = r1 + 1
            goto L1
        L37:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.M3.A0C(android.view.ViewGroup):android.widget.TextView");
    }

    public static void A0F(int i2, View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(i2 / 3);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration((i2 / 3) * 2);
        scaleAnimation2.setInterpolator(new BounceInterpolator());
        scaleAnimation.setAnimationListener(new C0934Vh(view, scaleAnimation2));
        view.startAnimation(scaleAnimation);
    }

    public static void A0G(int i2, View view) {
        Integer viewId = A04.get(Integer.valueOf(i2));
        if (viewId != null) {
            view.setId(viewId.intValue());
        } else {
            A0K(view);
        }
    }

    public static void A0H(View view) {
        A0N(view, 8);
    }

    public static void A0I(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            A0T((ViewGroup) parent);
        }
    }

    public static void A0J(View view) {
        if (view == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (A01[3].length() == 20) {
            throw new RuntimeException();
        }
        A01[3] = "DU33ZJN3ug5gIBKNKyYbqVVAVCFz";
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    public static void A0K(View view) {
        if (view == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            view.setId(View.generateViewId());
        } else {
            view.setId(A00());
        }
    }

    public static void A0L(View view) {
        A0N(view, 0);
    }

    public static void A0M(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(new ColorDrawable(i2));
        } else {
            view.setBackgroundDrawable(new ColorDrawable(i2));
        }
    }

    public static void A0N(View view, int i2) {
        if (view != null) {
            view.setVisibility(i2);
        }
    }

    public static void A0O(View view, int i2, int i3) {
        A0S(view, A08(i2, A02(i2), i3));
    }

    public static void A0P(View view, int i2, int i3, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{A03, A02});
        gradientDrawable.setCornerRadius(i2);
        gradientDrawable.setStroke(i3, i4);
        A0S(view, gradientDrawable);
    }

    public static void A0Q(View view, int i2, int i3, int i4) {
        A0S(view, A09(i2, A02(i2), i3, i4));
    }

    public static void A0R(View view, Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{A03, A02});
        gradientDrawable.setCornerRadius(0.0f);
        A0S(view, gradientDrawable);
    }

    public static void A0S(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static void A0T(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT > 19) {
            A0U(viewGroup, 200);
        }
    }

    public static void A0U(ViewGroup viewGroup, int i2) {
        if (Build.VERSION.SDK_INT > 19) {
            A0W(viewGroup, new AutoTransition(), i2);
        }
    }

    public static void A0V(ViewGroup viewGroup, Transition transition) {
        if (Build.VERSION.SDK_INT > 19) {
            A0W(viewGroup, transition, 200);
        }
    }

    public static void A0W(ViewGroup viewGroup, Transition transition, int i2) {
        transition.setDuration(i2);
        transition.setInterpolator(new AccelerateDecelerateInterpolator());
        TransitionManager.beginDelayedTransition(viewGroup, transition);
    }

    public static void A0X(Button button) {
        Typeface typeface;
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = A01;
            if (strArr[0].charAt(20) != strArr[2].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "0eysB36Fl0fjQH1dJXMQGfNSZ7";
            strArr2[6] = "2uEiWgVZ3g024XFvQ4YapgJ5oH";
            typeface = Typeface.create(A0D(Opcodes.DNEG, 13, 77), 0);
        } else {
            typeface = Typeface.create(Typeface.SANS_SERIF, 1);
        }
        button.setTypeface(typeface);
    }

    public static void A0Y(TextView textView, boolean z2, int i2) {
        Typeface typeface;
        if (!z2) {
            typeface = Typeface.create(Typeface.SANS_SERIF, 0);
        } else if (Build.VERSION.SDK_INT < 21) {
            typeface = Typeface.create(Typeface.SANS_SERIF, 1);
        } else {
            if (A01[5].length() != 25) {
                throw new RuntimeException();
            }
            A01[3] = "EYVeEO4Fu";
            typeface = Typeface.create(A0D(Opcodes.IINC, 17, Opcodes.DREM), 0);
        }
        textView.setTypeface(typeface);
        textView.setTextSize(2, i2);
    }

    public static void A0Z(Toast toast, String str, int i2, int i3, int i4) {
        if (toast == null) {
            return;
        }
        toast.setGravity(i2, i3, i4);
        TextView A0C = A0C((ViewGroup) toast.getView());
        if (A0C != null) {
            A0C.setText(str);
            A0C.setGravity(17);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0a(java.util.Map<java.lang.String, java.lang.String> r5, com.instagram.common.viewpoint.core.AbstractC1187cD r6) {
        /*
            if (r6 != 0) goto L3
            return
        L3:
            java.lang.String r4 = r6.A0c()
            int r0 = r4.hashCode()
            switch(r0) {
                case -1364000502: goto La6;
                case 604727084: goto L7f;
                default: goto Le;
            }
        Le:
            r3 = -1
        Lf:
            r2 = 0
            r1 = 10
            r0 = 6
            java.lang.String r1 = A0D(r2, r1, r0)
            switch(r3) {
                case 0: goto L75;
                case 1: goto L6b;
                default: goto L1a;
            }
        L1a:
            java.lang.String r3 = r6.A0X()
            r2 = 149(0x95, float:2.09E-43)
            r1 = 8
            r0 = 88
            java.lang.String r0 = A0D(r2, r1, r0)
            r5.put(r0, r3)
            boolean r0 = r6.A17()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            r2 = 84
            r1 = 21
            r0 = 11
            java.lang.String r0 = A0D(r2, r1, r0)
            r5.put(r0, r3)
            boolean r0 = r6.A13()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            r2 = 57
            r1 = 27
            r0 = 97
            java.lang.String r0 = A0D(r2, r1, r0)
            r5.put(r0, r3)
            long r0 = r6.A0U()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            r2 = 22
            r1 = 23
            r0 = 15
            java.lang.String r0 = A0D(r2, r1, r0)
            r5.put(r0, r3)
            return
        L6b:
            com.facebook.ads.internal.protocol.AdPlacementType r0 = com.facebook.ads.internal.protocol.AdPlacementType.REWARDED_VIDEO
            java.lang.String r0 = r0.name()
            r5.put(r1, r0)
            goto L1a
        L75:
            com.facebook.ads.internal.protocol.AdPlacementType r0 = com.facebook.ads.internal.protocol.AdPlacementType.INTERSTITIAL
            java.lang.String r0 = r0.name()
            r5.put(r1, r0)
            goto L1a
        L7f:
            r2 = 45
            r1 = 12
            r0 = 96
            java.lang.String r3 = A0D(r2, r1, r0)
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.M3.A01
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 20
            if (r1 == r0) goto Lb9
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.M3.A01
            java.lang.String r1 = "p9FB"
            r0 = 3
            r2[r0] = r1
            boolean r0 = r4.equals(r3)
            if (r0 == 0) goto Le
            r3 = 0
            goto Lf
        La6:
            r2 = 105(0x69, float:1.47E-43)
            r1 = 14
            r0 = 37
            java.lang.String r0 = A0D(r2, r1, r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Le
            r3 = 1
            goto Lf
        Lb9:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.M3.A0a(java.util.Map, com.facebook.ads.redexgen.X.cD):void");
    }

    public static void A0b(View... viewArr) {
        for (View view : viewArr) {
            A0J(view);
        }
    }

    public static boolean A0c(int i2) {
        return AbstractC02302p.A00(i2) < 0.5d;
    }

    public static boolean A0d(EnumC01700g enumC01700g, Map<String, String> extraData) {
        boolean nonIabDestination = !A0D(157, 9, 58).equals(extraData.get(A0D(10, 12, 107)));
        boolean nonCtaClick = enumC01700g != EnumC01700g.A08;
        return nonIabDestination && nonCtaClick;
    }

    public static boolean A0e(EnumC01700g enumC01700g, Map<String, String> extraData) {
        boolean equals = A0D(157, 9, 58).equals(extraData.get(A0D(10, 12, 107)));
        boolean ctaClick = enumC01700g != EnumC01700g.A08;
        return equals && ctaClick;
    }

    public static boolean A0f(C1045Zs c1045Zs, EnumC01700g enumC01700g) {
        return enumC01700g == EnumC01700g.A08 && C0608Im.A2j(c1045Zs);
    }
}
