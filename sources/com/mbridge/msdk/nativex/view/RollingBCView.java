package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.mbridge.msdk.nativex.adapter.RollingAdapter;
import com.mbridge.msdk.nativex.listener.RollingPagerListenrt;
import com.mbridge.msdk.nativex.view.MBNativeRollView;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;

/* loaded from: classes3.dex */
public class RollingBCView extends ViewPager {
    private NativeListener.FilpListener FilpListening;
    private boolean isReport;
    private RollingPagerListenrt listenrt;
    private MBNativeRollView.a mvinterface;

    private RollingBCView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isReport = true;
        this.listenrt = new RollingPagerListenrt();
        setOffscreenPageLimit(1);
        setClipChildren(false);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i9, int i10) {
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            int i11 = 0;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                childAt.measure(i9, View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i11) {
                    i11 = measuredHeight;
                }
                if (measuredHeight > 10 && this.isReport) {
                    this.listenrt.reportRollBC(0);
                    this.isReport = false;
                }
            }
            i10 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        super.onMeasure(i9, i10);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i9) {
        super.onWindowVisibilityChanged(i9);
    }

    public void setData(List<Frame> list, Context context, String str, MBNativeRollView.a aVar) {
        if (list != null && list.size() != 0) {
            RollingAdapter rollingAdapter = new RollingAdapter(list);
            if (aVar != null) {
                rollingAdapter.setMvinterface(aVar);
            }
            setAdapter(rollingAdapter);
            this.listenrt.setCampList(list, context, str);
            NativeListener.FilpListener filpListener = this.FilpListening;
            if (filpListener != null) {
                this.listenrt.setFilpListening(filpListener);
            }
            setOnPageChangeListener(this.listenrt);
            if (this.isReport) {
                this.listenrt.reportRollBC(0);
                this.isReport = false;
                return;
            }
            return;
        }
        throw new NegativeArraySizeException("ad date is null or size is 0");
    }

    public void setFilpListening(NativeListener.FilpListener filpListener) {
        this.FilpListening = filpListener;
    }

    public RollingBCView(Context context) {
        super(context);
        this.isReport = true;
        this.listenrt = new RollingPagerListenrt();
    }
}
