package com.bytedance.sdk.openadsdk.dislike;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.bannerexpress.zp;
import com.bytedance.sdk.openadsdk.core.ku;
import com.bytedance.sdk.openadsdk.utils.QUv;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class TTDislikeListView extends ListView {
    private final AdapterView.OnItemClickListener COT;
    private String KS;
    private String jU;
    private AdapterView.OnItemClickListener lMd;
    protected IListenerManager zp;

    public TTDislikeListView(Context context) {
        super(context);
        this.COT = new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.dislike.TTDislikeListView.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i9, long j7) {
                if (TTDislikeListView.this.getAdapter() != null && TTDislikeListView.this.getAdapter().getItem(i9) != null && (TTDislikeListView.this.getAdapter().getItem(i9) instanceof FilterWord)) {
                    FilterWord filterWord = (FilterWord) TTDislikeListView.this.getAdapter().getItem(i9);
                    if (!filterWord.hasSecondOptions()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(filterWord);
                        if (!TextUtils.isEmpty(TTDislikeListView.this.KS)) {
                            zp.zp().zp(TTDislikeListView.this.KS, arrayList);
                        }
                        if (!TextUtils.isEmpty(TTDislikeListView.this.jU)) {
                            if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                                TTDislikeListView.this.zp("onItemClickClosed");
                            } else {
                                zp.InterfaceC0106zp KS = ku.lMd().KS(TTDislikeListView.this.jU);
                                if (KS != null) {
                                    KS.zp();
                                    ku.lMd().jU(TTDislikeListView.this.jU);
                                }
                            }
                        }
                    }
                    try {
                        if (TTDislikeListView.this.lMd != null) {
                            TTDislikeListView.this.lMd.onItemClick(adapterView, view, i9, j7);
                            return;
                        }
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                throw new IllegalArgumentException("Adapter data is abnormal, it must be FilterWord");
            }
        };
        zp();
    }

    public void setClosedListenerKey(String str) {
        this.jU = str;
    }

    public void setMaterialMeta(String str) {
        this.KS = str;
    }

    @Override // android.widget.AdapterView
    public void setOnItemClickListener(@Nullable AdapterView.OnItemClickListener onItemClickListener) {
        this.lMd = onItemClickListener;
    }

    private void zp() {
        super.setOnItemClickListener(this.COT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(final String str) {
        QUv.KS(new com.bytedance.sdk.component.ku.ku("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.dislike.TTDislikeListView.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (!TextUtils.isEmpty(TTDislikeListView.this.jU)) {
                        TTDislikeListView.this.zp(6).executeDisLikeClosedCallback(TTDislikeListView.this.jU, str);
                    }
                } catch (Throwable th) {
                    tG.zp("TTDislikeListView", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    public IListenerManager zp(int i9) {
        if (this.zp == null) {
            this.zp = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.zp.zp().zp(i9));
        }
        return this.zp;
    }

    public static void zp(final int i9, final String str, final zp.InterfaceC0106zp interfaceC0106zp) {
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            QUv.KS(new com.bytedance.sdk.component.ku.ku("DislikeClosed_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.dislike.TTDislikeListView.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.zp zp = com.bytedance.sdk.openadsdk.multipro.aidl.zp.zp();
                    if (i9 == 6 && interfaceC0106zp != null) {
                        try {
                            com.bytedance.sdk.openadsdk.multipro.aidl.lMd.lMd lmd = new com.bytedance.sdk.openadsdk.multipro.aidl.lMd.lMd(str, interfaceC0106zp);
                            IListenerManager asInterface = IListenerManager.Stub.asInterface(zp.zp(6));
                            if (asInterface != null) {
                                asInterface.registerDisLikeClosedListener(str, lmd);
                            }
                        } catch (RemoteException e4) {
                            tG.zp("TTDislikeListView", e4.getMessage());
                        }
                    }
                }
            }, 5);
        }
    }

    public static void zp(final int i9, final String str) {
        if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
            QUv.KS(new com.bytedance.sdk.component.ku.ku("DislikeClosed_unregisterMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.dislike.TTDislikeListView.4
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.zp zp = com.bytedance.sdk.openadsdk.multipro.aidl.zp.zp();
                    if (i9 == 6) {
                        try {
                            IListenerManager asInterface = IListenerManager.Stub.asInterface(zp.zp(6));
                            if (asInterface != null) {
                                asInterface.unregisterDisLikeClosedListener(str);
                            }
                        } catch (RemoteException unused) {
                        }
                    }
                }
            }, 5);
        }
    }
}
