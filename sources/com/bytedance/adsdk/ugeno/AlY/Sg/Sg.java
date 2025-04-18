package com.bytedance.adsdk.ugeno.AlY.Sg;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.AlY.DSW;
import com.bytedance.adsdk.ugeno.DSW.qsH;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Map;

/* loaded from: classes.dex */
public class Sg extends YFl {
    private float NjR;
    private String YoT;
    private int eT;

    /* renamed from: nc, reason: collision with root package name */
    private float f10231nc;

    public Sg(Context context) {
        super(context);
        this.eT = 0;
        this.YoT = "up";
    }

    @Override // com.bytedance.adsdk.ugeno.AlY.Sg.YFl
    public boolean YFl(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        Map<String, String> map = this.wN;
        if (map != null) {
            this.YoT = TextUtils.isEmpty(map.get("direction")) ? "all" : this.wN.get("direction");
            this.eT = com.bytedance.adsdk.ugeno.DSW.tN.YFl(this.wN.get("distance"), 0);
        }
        return YFl(this.Sg, (MotionEvent) objArr[0]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private boolean YFl(com.bytedance.adsdk.ugeno.Sg.Sg sg2, MotionEvent motionEvent) {
        char c10;
        DSW dsw;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.NjR = motionEvent.getX();
            this.f10231nc = motionEvent.getY();
        } else if (action == 1 || action == 3) {
            float x10 = motionEvent.getX();
            float y4 = motionEvent.getY();
            if (this.eT == 0 && (dsw = this.YFl) != null) {
                dsw.YFl(sg2, this.f10232vc, this.tN.Sg());
                return true;
            }
            int Sg = qsH.Sg(this.qsH, x10 - this.NjR);
            int Sg2 = qsH.Sg(this.qsH, y4 - this.f10231nc);
            String str = this.YoT;
            switch (str.hashCode()) {
                case 3739:
                    if (str.equals("up")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 96673:
                    if (str.equals("all")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3089570:
                    if (str.equals("down")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3317767:
                    if (str.equals(TtmlNode.LEFT)) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 108511772:
                    if (str.equals(TtmlNode.RIGHT)) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            if (c10 == 0) {
                Sg = -Sg2;
            } else if (c10 == 1) {
                Sg = Sg2;
            } else if (c10 == 2) {
                Sg = -Sg;
            } else if (c10 != 3) {
                Sg = (int) Math.abs(Math.sqrt(Math.pow(Sg2, 2.0d) + Math.pow(Sg, 2.0d)));
            }
            if (Sg < this.eT) {
                return false;
            }
            DSW dsw2 = this.YFl;
            if (dsw2 != null) {
                this.NjR = 0.0f;
                this.f10231nc = 0.0f;
                dsw2.YFl(sg2, this.f10232vc, this.tN.Sg());
                return true;
            }
        }
        return true;
    }
}
