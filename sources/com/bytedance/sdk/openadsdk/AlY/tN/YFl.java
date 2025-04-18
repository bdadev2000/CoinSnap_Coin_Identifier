package com.bytedance.sdk.openadsdk.AlY.tN;

import androidx.core.app.NotificationCompat;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.bytedance.sdk.openadsdk.utils.Sco;

/* loaded from: classes.dex */
public class YFl {

    /* renamed from: com.bytedance.sdk.openadsdk.AlY.tN.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0100YFl {
        public static final String AlY;
        public static final String Sg;
        public static final String YFl;
        public static final String tN;

        /* renamed from: vc, reason: collision with root package name */
        public static final String f10509vc;
        public static final String wN;

        static {
            CharSequence[] charSequenceArr = {Sco.wXo(), "load_start"};
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequenceArr[0]);
            sb2.append((CharSequence) "_");
            sb2.append(charSequenceArr[1]);
            YFl = sb2.toString();
            CharSequence[] charSequenceArr2 = {Sco.wXo(), "load_finish"};
            StringBuilder sb3 = new StringBuilder();
            sb3.append(charSequenceArr2[0]);
            sb3.append((CharSequence) "_");
            sb3.append(charSequenceArr2[1]);
            Sg = sb3.toString();
            CharSequence[] charSequenceArr3 = {Sco.wXo(), AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL};
            StringBuilder sb4 = new StringBuilder();
            sb4.append(charSequenceArr3[0]);
            sb4.append((CharSequence) "_");
            sb4.append(charSequenceArr3[1]);
            tN = sb4.toString();
            CharSequence[] charSequenceArr4 = {Sco.wXo(), Sco.aIu()};
            StringBuilder sb5 = new StringBuilder();
            sb5.append(charSequenceArr4[0]);
            sb5.append((CharSequence) "_");
            sb5.append(charSequenceArr4[1]);
            AlY = sb5.toString();
            CharSequence[] charSequenceArr5 = {Sco.wXo(), Sco.aIu(), "show"};
            StringBuilder sb6 = new StringBuilder();
            sb6.append(charSequenceArr5[0]);
            for (int i10 = 1; i10 < 3; i10++) {
                sb6.append((CharSequence) "_");
                sb6.append(charSequenceArr5[i10]);
            }
            wN = sb6.toString();
            CharSequence[] charSequenceArr6 = {Sco.wXo(), Sco.aIu(), NotificationCompat.CATEGORY_PROGRESS};
            StringBuilder sb7 = new StringBuilder();
            sb7.append(charSequenceArr6[0]);
            for (int i11 = 1; i11 < 3; i11++) {
                sb7.append((CharSequence) "_");
                sb7.append(charSequenceArr6[i11]);
            }
            f10509vc = sb7.toString();
        }
    }
}
