package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.plantcare.ai.identifier.plantid.R;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public final int f1118b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1119c;

    public BrowserActionsFallbackMenuView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1118b = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);
        this.f1119c = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1118b * 2), this.f1119c), 1073741824), i11);
    }
}
