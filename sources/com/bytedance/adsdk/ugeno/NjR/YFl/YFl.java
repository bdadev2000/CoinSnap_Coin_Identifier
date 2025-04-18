package com.bytedance.adsdk.ugeno.NjR.YFl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.DSW.AlY;
import com.bytedance.adsdk.ugeno.DSW.YFl;
import com.bytedance.adsdk.ugeno.DSW.qsH;
import com.bytedance.adsdk.ugeno.NjR.vc.Sg;
import com.bytedance.adsdk.ugeno.YFl;

/* loaded from: classes.dex */
public class YFl extends Sg {
    private boolean Af;
    private String ECi;
    private String Gmi;
    private YFl.C0061YFl IXB;
    private int VJb;
    private String dU;

    /* renamed from: ni, reason: collision with root package name */
    private String f10240ni;

    /* renamed from: xg, reason: collision with root package name */
    private int f10241xg;
    private boolean yn;

    public YFl(Context context) {
        super(context);
        this.Gmi = "row";
    }

    private void tN() {
        if (TextUtils.isEmpty(this.f10240ni)) {
            return;
        }
        ((TextView) this.wN).setCompoundDrawables(null, null, null, null);
        if (this.f10240ni.startsWith("local://")) {
            try {
                String replace = this.f10240ni.replace("local://", "");
                Context context = this.Sg;
                Sg(qsH.YFl(context, AlY.YFl(context, replace)));
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        com.bytedance.adsdk.ugeno.AlY.YFl().Sg().YFl(this.NjR, this.f10240ni, new YFl.InterfaceC0065YFl() { // from class: com.bytedance.adsdk.ugeno.NjR.YFl.YFl.1
            @Override // com.bytedance.adsdk.ugeno.YFl.InterfaceC0065YFl
            public void YFl(final Bitmap bitmap) {
                if (bitmap == null) {
                    return;
                }
                qsH.YFl(new Runnable() { // from class: com.bytedance.adsdk.ugeno.NjR.YFl.YFl.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        YFl.this.Sg(new BitmapDrawable(((com.bytedance.adsdk.ugeno.Sg.Sg) YFl.this).Sg.getResources(), bitmap));
                    }
                });
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    public void GS() {
        super.GS();
        if (this.yn) {
            ((TextView) this.wN).setTextColor(this.f10241xg);
        }
        if (this.Af) {
            if (this.qjy) {
                YFl(this.IXB);
            } else {
                AlY(this.VJb);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.NjR.vc.Sg, com.bytedance.adsdk.ugeno.Sg.Sg
    public void Sg() {
        super.Sg();
        tN();
    }

    @Override // com.bytedance.adsdk.ugeno.Sg.Sg
    public void lu() {
        super.lu();
        if (this.yn) {
            ((TextView) this.wN).setTextColor(((Sg) this).Gnp);
        }
        if (this.Af) {
            if (this.qjy) {
                YFl(this.jz);
            } else {
                AlY(this.zB);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void Sg(Drawable drawable) {
        char c10;
        if (drawable == null) {
            return;
        }
        String str = this.Gmi;
        switch (str.hashCode()) {
            case -1781065991:
                if (str.equals("column_reverse")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1354837162:
                if (str.equals("column")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -207799939:
                if (str.equals("row_reverse")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 113114:
                if (str.equals("row")) {
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
            ((TextView) this.wN).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            return;
        }
        if (c10 == 1) {
            ((TextView) this.wN).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        } else if (c10 != 2) {
            ((TextView) this.wN).setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            ((TextView) this.wN).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, drawable);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.NjR.vc.Sg, com.bytedance.adsdk.ugeno.Sg.Sg
    public void YFl(String str, String str2) {
        super.YFl(str, str2);
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -962590849:
                if (str.equals("direction")) {
                    c10 = 0;
                    break;
                }
                break;
            case -808924190:
                if (str.equals("highlightTextColor")) {
                    c10 = 1;
                    break;
                }
                break;
            case -104120541:
                if (str.equals("highlightedTextColor")) {
                    c10 = 2;
                    break;
                }
                break;
            case 100313435:
                if (str.equals("image")) {
                    c10 = 3;
                    break;
                }
                break;
            case 496106759:
                if (str.equals("highlightImage")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1126933377:
                if (str.equals("highlightBackgroundColor")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1132404089:
                if (str.equals("highlightBackgroundImage")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                this.Gmi = str2;
                return;
            case 1:
            case 2:
                this.f10241xg = com.bytedance.adsdk.ugeno.DSW.YFl.YFl(str2);
                this.yn = true;
                return;
            case 3:
                this.f10240ni = str2;
                return;
            case 4:
                this.dU = str2;
                return;
            case 5:
                if (com.bytedance.adsdk.ugeno.DSW.YFl.tN(str2)) {
                    this.qjy = true;
                    this.IXB = com.bytedance.adsdk.ugeno.DSW.YFl.Sg(str2);
                } else {
                    this.VJb = com.bytedance.adsdk.ugeno.DSW.YFl.YFl(str2);
                    this.qjy = false;
                }
                this.Af = true;
                return;
            case 6:
                this.ECi = str2;
                return;
            default:
                return;
        }
    }
}
