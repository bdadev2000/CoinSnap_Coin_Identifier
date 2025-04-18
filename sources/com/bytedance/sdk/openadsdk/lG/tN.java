package com.bytedance.sdk.openadsdk.lG;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.sdk.component.DSW.YFl;
import com.bytedance.sdk.component.Sg.YFl.AlY;
import com.bytedance.sdk.component.Sg.YFl.YFl.YFl.NjR;
import com.bytedance.sdk.component.wN.eT;
import com.bytedance.sdk.component.wN.qsH;
import com.bytedance.sdk.openadsdk.core.lG;
import com.bytedance.sdk.openadsdk.core.model.EH;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.core.settings.rkt;
import com.bytedance.sdk.openadsdk.utils.GS;
import com.bytedance.sdk.openadsdk.utils.mn;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class tN {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile tN YFl;
    private final com.bytedance.sdk.component.DSW.YFl Sg;
    private com.bytedance.sdk.openadsdk.lG.YFl.tN tN;

    private tN(Context context) {
        YFl.C0075YFl c0075YFl = new YFl.C0075YFl();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        com.bytedance.sdk.component.DSW.YFl YFl2 = c0075YFl.YFl(10000L, timeUnit).Sg(10000L, timeUnit).tN(10000L, timeUnit).YFl(true).YFl();
        this.Sg = YFl2;
        com.bytedance.sdk.component.Sg.YFl.YFl.YFl.YFl.YFl(new NjR() { // from class: com.bytedance.sdk.openadsdk.lG.tN.1
            @Override // com.bytedance.sdk.component.Sg.YFl.YFl.YFl.NjR
            public boolean Sg() {
                return rkt.JwO().ZS();
            }

            @Override // com.bytedance.sdk.component.Sg.YFl.YFl.YFl.NjR
            public ExecutorService YFl() {
                if (rkt.JwO().ZS()) {
                    return mn.nc();
                }
                return null;
            }
        });
        AlY YFl3 = YFl2.wN().YFl();
        if (YFl3 != null) {
            YFl3.YFl(32);
        }
    }

    private void AlY() {
        if (this.tN == null) {
            this.tN = new com.bytedance.sdk.openadsdk.lG.YFl.tN();
        }
    }

    public static tN YFl() {
        if (YFl == null) {
            synchronized (tN.class) {
                if (YFl == null) {
                    YFl = new tN(lG.YFl());
                }
            }
        }
        return YFl;
    }

    public com.bytedance.sdk.component.DSW.YFl Sg() {
        return this.Sg;
    }

    public com.bytedance.sdk.openadsdk.lG.YFl.tN tN() {
        AlY();
        return this.tN;
    }

    public void YFl(String str, int i10, int i11, ImageView imageView, Wwa wwa) {
        com.bytedance.sdk.openadsdk.NjR.AlY.YFl(str).YFl(i10).Sg(i11).wN(GS.AlY(lG.YFl())).AlY(GS.tN(lG.YFl())).tN(2).YFl(com.bytedance.sdk.openadsdk.NjR.tN.YFl(wwa, str, imageView));
    }

    public void YFl(int i10, final ImageView imageView, final Wwa wwa) {
        com.bytedance.sdk.openadsdk.NjR.AlY.YFl(wwa.vc()).YFl(i10).Sg(i10).wN(GS.AlY(lG.YFl())).AlY(GS.tN(lG.YFl())).tN(2).YFl(com.bytedance.sdk.openadsdk.NjR.tN.YFl(wwa, wwa.vc(), imageView));
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lG.tN.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (imageView.getDrawable() != null) {
                        Intent intent = new Intent();
                        String DSW = wwa.DSW();
                        intent.setAction("android.intent.action.VIEW");
                        intent.setData(Uri.parse(DSW));
                        try {
                            com.bytedance.sdk.component.utils.Sg.YFl(lG.YFl(), intent, null);
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    public void YFl(EH eh2, ImageView imageView, Wwa wwa) {
        if (eh2 == null || TextUtils.isEmpty(eh2.YFl()) || imageView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.NjR.AlY.YFl(eh2).tN(2).YFl(com.bytedance.sdk.openadsdk.NjR.tN.YFl(wwa, eh2.YFl(), imageView));
    }

    public void YFl(String str, View view) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        com.bytedance.sdk.openadsdk.NjR.AlY.YFl(str).tN(2).YFl(new qsH() { // from class: com.bytedance.sdk.openadsdk.lG.tN.4
            @Override // com.bytedance.sdk.component.wN.qsH
            public Bitmap YFl(Bitmap bitmap) {
                View view2 = (View) weakReference.get();
                if (view2 == null) {
                    return null;
                }
                return com.bytedance.sdk.component.adexpress.AlY.YFl.YFl(view2.getContext(), bitmap, 10);
            }
        }).YFl(new com.bytedance.sdk.component.wN.rkt<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.lG.tN.3
            @Override // com.bytedance.sdk.component.wN.rkt
            public void YFl(int i10, String str2, Throwable th2) {
            }

            @Override // com.bytedance.sdk.component.wN.rkt
            public void YFl(eT<Bitmap> eTVar) {
                final View view2;
                if (eTVar == null) {
                    return;
                }
                final Bitmap Sg = eTVar.Sg();
                if (!(Sg instanceof Bitmap) || (view2 = (View) weakReference.get()) == null) {
                    return;
                }
                if (mn.wN()) {
                    if (view2 instanceof ImageView) {
                        ((ImageView) view2).setImageDrawable(new BitmapDrawable(view2.getResources(), Sg));
                        return;
                    } else {
                        view2.setBackground(new BitmapDrawable(view2.getResources(), Sg));
                        return;
                    }
                }
                view2.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.lG.tN.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        View view3 = view2;
                        if (view3 instanceof ImageView) {
                            ((ImageView) view3).setImageDrawable(new BitmapDrawable(view2.getResources(), (Bitmap) Sg));
                        } else {
                            view3.setBackground(new BitmapDrawable(view2.getResources(), (Bitmap) Sg));
                        }
                    }
                });
            }
        });
    }
}
