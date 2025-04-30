package com.bytedance.adsdk.ugeno.component;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.component.flexbox.FlexboxLayout;
import com.bytedance.adsdk.ugeno.lMd.ku;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class zp<E extends ViewGroup> extends lMd {
    protected List<lMd<View>> zp;

    public zp(Context context) {
        this(context, null);
    }

    public C0066zp ku() {
        return new C0066zp();
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    public void lMd() {
        super.lMd();
    }

    public void zp(lMd lmd) {
        if (lmd == null) {
            return;
        }
        this.zp.add(lmd);
        View YW = lmd.YW();
        if (YW != null) {
            ((ViewGroup) this.COT).addView(YW);
        }
    }

    public zp(Context context, zp zpVar) {
        super(context, zpVar);
        this.zp = new ArrayList();
    }

    public List<lMd<View>> zp() {
        return this.zp;
    }

    @Override // com.bytedance.adsdk.ugeno.component.lMd
    public lMd zp(String str) {
        lMd<View> lMd;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.dT)) {
            return this;
        }
        for (lMd<View> lmd : this.zp) {
            if (lmd != null && (lMd = lmd.lMd(str)) != null) {
                return lMd;
            }
        }
        return null;
    }

    /* renamed from: com.bytedance.adsdk.ugeno.component.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0066zp {
        protected float COT;
        protected float HWF;
        protected float KS;
        protected float QR;
        protected float jU;
        protected ViewGroup.LayoutParams ku;
        protected float lMd;
        protected float zp;

        public void zp(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            str.getClass();
            char c9 = 65535;
            switch (str.hashCode()) {
                case -1221029593:
                    if (str.equals("height")) {
                        c9 = 0;
                        break;
                    }
                    break;
                case -1081309778:
                    if (str.equals("margin")) {
                        c9 = 1;
                        break;
                    }
                    break;
                case -1044792121:
                    if (str.equals("marginTop")) {
                        c9 = 2;
                        break;
                    }
                    break;
                case -289173127:
                    if (str.equals("marginBottom")) {
                        c9 = 3;
                        break;
                    }
                    break;
                case 113126854:
                    if (str.equals("width")) {
                        c9 = 4;
                        break;
                    }
                    break;
                case 975087886:
                    if (str.equals("marginRight")) {
                        c9 = 5;
                        break;
                    }
                    break;
                case 1970934485:
                    if (str.equals("marginLeft")) {
                        c9 = 6;
                        break;
                    }
                    break;
            }
            switch (c9) {
                case 0:
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.lMd = -1.0f;
                        return;
                    } else if (TextUtils.equals(str2, "wrap_content")) {
                        this.lMd = -2.0f;
                        return;
                    } else {
                        this.lMd = ku.zp(context, str2);
                        return;
                    }
                case 1:
                    this.KS = ku.zp(context, str2);
                    return;
                case 2:
                    this.HWF = ku.zp(context, str2);
                    return;
                case 3:
                    this.QR = ku.zp(context, str2);
                    return;
                case 4:
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.zp = -1.0f;
                        return;
                    } else if (TextUtils.equals(str2, "wrap_content")) {
                        this.zp = -2.0f;
                        return;
                    } else {
                        this.zp = ku.zp(context, str2);
                        return;
                    }
                case 5:
                    this.COT = ku.zp(context, str2);
                    return;
                case 6:
                    this.jU = ku.zp(context, str2);
                    return;
                default:
                    return;
            }
        }

        public ViewGroup.LayoutParams zp() {
            FlexboxLayout.zp zpVar = new FlexboxLayout.zp((int) this.zp, (int) this.lMd);
            ((ViewGroup.MarginLayoutParams) zpVar).leftMargin = (int) this.jU;
            ((ViewGroup.MarginLayoutParams) zpVar).rightMargin = (int) this.COT;
            ((ViewGroup.MarginLayoutParams) zpVar).topMargin = (int) this.HWF;
            ((ViewGroup.MarginLayoutParams) zpVar).bottomMargin = (int) this.QR;
            return zpVar;
        }
    }
}
