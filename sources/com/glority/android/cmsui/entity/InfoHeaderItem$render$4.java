package com.glority.android.cmsui.entity;

import androidx.viewpager2.widget.ViewPager2;
import com.glority.android.cmsui.widget.InfoHeaderBottomView;
import kotlin.Metadata;

/* compiled from: InfoHeaderItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/glority/android/cmsui/entity/InfoHeaderItem$render$4", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "onPageSelected", "", "position", "", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class InfoHeaderItem$render$4 extends ViewPager2.OnPageChangeCallback {
    final /* synthetic */ InfoHeaderBottomView $countView;
    final /* synthetic */ ViewPager2 $viewPager2;
    final /* synthetic */ InfoHeaderItem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public InfoHeaderItem$render$4(InfoHeaderItem infoHeaderItem, ViewPager2 viewPager2, InfoHeaderBottomView infoHeaderBottomView) {
        this.this$0 = infoHeaderItem;
        this.$viewPager2 = viewPager2;
        this.$countView = infoHeaderBottomView;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(final int position) {
        if (this.this$0.getCurrentIndex() == position) {
            return;
        }
        this.this$0.setCurrentIndex(position);
        this.$viewPager2.post(new Runnable() { // from class: com.glority.android.cmsui.entity.InfoHeaderItem$render$4$onPageSelected$1
            @Override // java.lang.Runnable
            public final void run() {
                InfoHeaderItem$render$4.this.$countView.select(position);
                InfoHeaderItem$render$4.this.this$0.getOnItemSelected().invoke(Integer.valueOf(position));
            }
        });
    }
}
