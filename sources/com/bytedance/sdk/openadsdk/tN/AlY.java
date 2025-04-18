package com.bytedance.sdk.openadsdk.tN;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.qO;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.utils.GS;
import java.util.List;

/* loaded from: classes.dex */
public class AlY extends TTDislikeDialogAbstract {
    private YFl AlY;
    private String wN;

    /* loaded from: classes.dex */
    public interface YFl {
        void Sg();

        void YFl();

        void YFl(int i10, FilterWord filterWord);
    }

    public AlY(Context context, String str, List<FilterWord> list, String str2) {
        super(context, qO.vc(context, "tt_dislikeDialog"), str2);
        this.YFl = str;
        this.Sg = list;
    }

    private void Sg() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.bytedance.sdk.openadsdk.tN.AlY.1
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                if (AlY.this.AlY != null) {
                    YFl unused = AlY.this.AlY;
                }
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.bytedance.sdk.openadsdk.tN.AlY.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (AlY.this.AlY != null) {
                    AlY.this.AlY.Sg();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(GS.tN(getContext()) - 120, -2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public View getLayoutView() {
        return new NjR(getContext(), this.tN, this.Sg);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract, android.app.Dialog
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            setCanceledOnTouchOutside(true);
            setCancelable(true);
            YFl();
            Sg();
            setMaterialMeta(this.YFl, this.Sg);
        } catch (Throwable unused) {
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public void YFl(YFl yFl) {
        this.AlY = yFl;
    }

    public void YFl(String str) {
        this.wN = str;
    }

    @Override // com.bytedance.sdk.openadsdk.tN.nc.Sg
    public void YFl(int i10) {
        FilterWord Sg;
        if (nc.tN == i10) {
            dismiss();
            return;
        }
        if (nc.wN == i10) {
            YFl yFl = this.AlY;
            if (yFl != null) {
                yFl.YFl();
                return;
            }
            return;
        }
        if (nc.Sg != i10 || (Sg = this.tN.Sg()) == null || nc.YFl.equals(Sg)) {
            return;
        }
        YFl yFl2 = this.AlY;
        if (yFl2 != null) {
            try {
                yFl2.YFl(0, Sg);
            } catch (Throwable unused) {
            }
        }
        dismiss();
    }

    private void YFl() {
        Window window = getWindow();
        if (window == null || window.getAttributes() == null) {
            return;
        }
        window.getAttributes().windowAnimations = 0;
    }
}
