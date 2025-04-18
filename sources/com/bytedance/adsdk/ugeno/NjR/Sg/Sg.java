package com.bytedance.adsdk.ugeno.NjR.Sg;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.Sg.YFl;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public class Sg extends com.bytedance.adsdk.ugeno.Sg.YFl<com.bytedance.adsdk.ugeno.NjR.Sg.YFl> {
    private com.bytedance.adsdk.ugeno.NjR.Sg.YFl Gnp;

    /* loaded from: classes.dex */
    public static class YFl extends YFl.C0064YFl {
        protected int Ne = -1;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private int Sg(String str) {
            char c10;
            str.getClass();
            switch (str.hashCode()) {
                case -1383228885:
                    if (str.equals("bottom")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1364013995:
                    if (str.equals(TtmlNode.CENTER)) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -348726240:
                    if (str.equals("center_vertical")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 115029:
                    if (str.equals("top")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3317767:
                    if (str.equals(TtmlNode.LEFT)) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 108511772:
                    if (str.equals(TtmlNode.RIGHT)) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1063616078:
                    if (str.equals("center_horizontal")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
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

        @Override // com.bytedance.adsdk.ugeno.Sg.YFl.C0064YFl
        /* renamed from: Sg, reason: merged with bridge method [inline-methods] */
        public FrameLayout.LayoutParams YFl() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.YFl, (int) this.Sg);
            layoutParams.leftMargin = (int) this.AlY;
            layoutParams.rightMargin = (int) this.wN;
            layoutParams.topMargin = (int) this.f10258vc;
            layoutParams.bottomMargin = (int) this.DSW;
            layoutParams.gravity = this.Ne;
            return layoutParams;
        }

        @Override // com.bytedance.adsdk.ugeno.Sg.YFl.C0064YFl
        public void YFl(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.YFl(context, str, str2);
            if (TextUtils.equals(str, "layoutGravity")) {
                this.Ne = YFl(str2);
            }
        }

        private int YFl(String str) {
            String[] split;
            if (TextUtils.isEmpty(str) || (split = str.split("\\|")) == null || split.length <= 0) {
                return -1;
            }
            int i10 = 0;
            for (String str2 : split) {
                i10 |= Sg(str2);
            }
            return i10;
        }
    }

    public Sg(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.YFl, com.bytedance.adsdk.ugeno.Sg.Sg
    public void Sg() {
        this.Gnp.setEventMap(this.SVa);
        super.Sg();
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    /* renamed from: ZU, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.NjR.Sg.YFl AlY() {
        com.bytedance.adsdk.ugeno.NjR.Sg.YFl yFl = new com.bytedance.adsdk.ugeno.NjR.Sg.YFl(this.Sg);
        this.Gnp = yFl;
        yFl.YFl(this);
        return this.Gnp;
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.YFl
    public YFl.C0064YFl tN() {
        return new YFl();
    }
}
