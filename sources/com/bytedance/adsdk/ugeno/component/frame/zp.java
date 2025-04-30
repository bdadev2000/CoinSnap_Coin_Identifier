package com.bytedance.adsdk.ugeno.component.frame;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.component.zp;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public class zp extends com.bytedance.adsdk.ugeno.component.zp<UGFrameLayout> {
    private UGFrameLayout DY;

    /* renamed from: com.bytedance.adsdk.ugeno.component.frame.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0065zp extends zp.C0066zp {
        protected int YW = -1;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private int lMd(String str) {
            char c9;
            str.getClass();
            switch (str.hashCode()) {
                case -1383228885:
                    if (str.equals("bottom")) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -1364013995:
                    if (str.equals(TtmlNode.CENTER)) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -348726240:
                    if (str.equals("center_vertical")) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 115029:
                    if (str.equals("top")) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 3317767:
                    if (str.equals(TtmlNode.LEFT)) {
                        c9 = 4;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 108511772:
                    if (str.equals(TtmlNode.RIGHT)) {
                        c9 = 5;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1063616078:
                    if (str.equals("center_horizontal")) {
                        c9 = 6;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            switch (c9) {
                case 0:
                    return 80;
                case 1:
                    return 17;
                case 2:
                    return 16;
                case 3:
                    return 48;
                case 4:
                    return 3;
                case 5:
                    return 5;
                case 6:
                    return 1;
                default:
                    return -1;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.component.zp.C0066zp
        /* renamed from: lMd, reason: merged with bridge method [inline-methods] */
        public FrameLayout.LayoutParams zp() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.zp, (int) this.lMd);
            layoutParams.leftMargin = (int) this.jU;
            layoutParams.rightMargin = (int) this.COT;
            layoutParams.topMargin = (int) this.HWF;
            layoutParams.bottomMargin = (int) this.QR;
            layoutParams.gravity = this.YW;
            return layoutParams;
        }

        @Override // com.bytedance.adsdk.ugeno.component.zp.C0066zp
        public void zp(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.zp(context, str, str2);
            if (TextUtils.equals(str, "layoutGravity")) {
                this.YW = zp(str2);
            }
        }

        private int zp(String str) {
            String[] split;
            if (TextUtils.isEmpty(str) || (split = str.split("\\|")) == null || split.length <= 0) {
                return -1;
            }
            int i9 = 0;
            for (String str2 : split) {
                i9 |= lMd(str2);
            }
            return i9;
        }
    }

    public zp(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.zp
    public zp.C0066zp ku() {
        return new C0065zp();
    }

    @Override // com.bytedance.adsdk.ugeno.component.zp, com.bytedance.adsdk.ugeno.component.lMd
    public void lMd() {
        this.DY.setEventMap(this.si);
        super.lMd();
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    /* renamed from: vwr, reason: merged with bridge method [inline-methods] */
    public UGFrameLayout KS() {
        UGFrameLayout uGFrameLayout = new UGFrameLayout(this.lMd);
        this.DY = uGFrameLayout;
        uGFrameLayout.zp(this);
        return this.DY;
    }
}
