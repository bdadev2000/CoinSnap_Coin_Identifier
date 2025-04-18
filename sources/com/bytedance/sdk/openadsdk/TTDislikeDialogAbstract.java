package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.tN.nc;
import java.util.List;

/* loaded from: classes.dex */
public abstract class TTDislikeDialogAbstract extends Dialog implements nc.Sg {
    private View AlY;
    protected List<FilterWord> Sg;
    protected String YFl;
    protected final nc tN;
    private String wN;

    public TTDislikeDialogAbstract(@NonNull Context context) {
        super(context);
        nc ncVar = new nc();
        this.tN = ncVar;
        ncVar.YFl(this);
    }

    public void destroy() {
        nc ncVar = this.tN;
        if (ncVar != null) {
            ncVar.YFl();
        }
    }

    public nc getDislikeManager() {
        return this.tN;
    }

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract View getLayoutView();

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View layoutView = getLayoutView();
        this.AlY = layoutView;
        if (layoutView == null) {
            YoT.Sg("getLayoutView,layout  may be abnormal, please check");
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        View view = this.AlY;
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        setContentView(view, layoutParams);
    }

    public void onSuggestionSubmit(String str) {
        nc ncVar = this.tN;
        if (ncVar != null) {
            ncVar.tN(str);
        }
    }

    public void setMaterialMeta(String str, List<FilterWord> list) {
        this.YFl = str;
        this.Sg = list;
        this.tN.YFl(str);
        this.tN.YFl(this.Sg);
    }

    public TTDislikeDialogAbstract(@NonNull Context context, int i10, String str) {
        super(context, i10);
        this.wN = str;
        nc ncVar = new nc();
        this.tN = ncVar;
        ncVar.YFl(this);
    }
}
