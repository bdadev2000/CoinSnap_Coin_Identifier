package E6;

import G7.j;
import android.view.KeyEvent;
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import com.tools.arruler.ui.component.home.HomeActivity;
import u6.AbstractC2789e;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1043a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ c(KeyEvent.Callback callback, int i9) {
        this.f1043a = i9;
        this.b = callback;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
        KeyEvent.Callback callback = this.b;
        switch (this.f1043a) {
            case 0:
                int i9 = HomeActivity.m;
                HomeActivity homeActivity = (HomeActivity) callback;
                j.e(homeActivity, "this$0");
                if (z8 && ((AbstractC2789e) homeActivity.k()).f23291t.getCurrentItem() != 1) {
                    ((AbstractC2789e) homeActivity.k()).f23291t.setCurrentItem(1);
                    return;
                } else {
                    if (!z8 && ((AbstractC2789e) homeActivity.k()).f23291t.getCurrentItem() != 0) {
                        ((AbstractC2789e) homeActivity.k()).f23291t.setCurrentItem(0);
                        return;
                    }
                    return;
                }
            default:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) callback).f13997k;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z8);
                    return;
                }
                return;
        }
    }
}
