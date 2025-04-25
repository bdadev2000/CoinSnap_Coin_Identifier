package com.glority.base.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes6.dex */
public class NPImageZoomViewPager extends ViewPager {
    private static final String TAG = "NPImageZoomViewPager";
    private boolean isZoomBackToOriginalScale;
    private OnPageSelectedListener onPageSelectedListener;
    private int previousPosition;

    /* loaded from: classes6.dex */
    public interface OnPageSelectedListener {
        void onPageSelected(int i);
    }

    public NPImageZoomViewPager(Context context) {
        super(context);
        this.isZoomBackToOriginalScale = false;
        init();
    }

    public NPImageZoomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isZoomBackToOriginalScale = false;
        init();
    }

    private void init() {
        this.previousPosition = getCurrentItem();
        addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() { // from class: com.glority.base.widget.NPImageZoomViewPager.1
            @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                if (NPImageZoomViewPager.this.onPageSelectedListener != null) {
                    NPImageZoomViewPager.this.onPageSelectedListener.onPageSelected(i);
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                if (NPImageZoomViewPager.this.isZoomBackToOriginalScale && i == 2 && NPImageZoomViewPager.this.previousPosition != NPImageZoomViewPager.this.getCurrentItem()) {
                    try {
                        NPImageZoomViewPager nPImageZoomViewPager = NPImageZoomViewPager.this;
                        NPImageViewTouch nPImageViewTouch = (NPImageViewTouch) nPImageZoomViewPager.getChildAt(nPImageZoomViewPager.getCurrentItem());
                        if (nPImageViewTouch != null) {
                            nPImageViewTouch.zoomTo(1.0f, 300L);
                        }
                        NPImageZoomViewPager nPImageZoomViewPager2 = NPImageZoomViewPager.this;
                        nPImageZoomViewPager2.previousPosition = nPImageZoomViewPager2.getCurrentItem();
                    } catch (ClassCastException e) {
                        Log.e(NPImageZoomViewPager.TAG, "This view pager should have only NPImageViewTouch as a children.", e);
                    } catch (IndexOutOfBoundsException unused) {
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager
    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof NPImageViewTouch) {
            return ((NPImageViewTouch) view).canScroll(i);
        }
        return super.canScroll(view, z, i, i2, i3);
    }

    public void setOnPageSelectedListener(OnPageSelectedListener onPageSelectedListener) {
        this.onPageSelectedListener = onPageSelectedListener;
    }

    public OnPageSelectedListener getOnPageSelectedListener() {
        return this.onPageSelectedListener;
    }

    public void removeOnPageChangeListeners() {
        clearOnPageChangeListeners();
    }

    public boolean isZoomBackToOriginalScale() {
        return this.isZoomBackToOriginalScale;
    }

    public void setZoomBackToOriginalScale(boolean z) {
        this.isZoomBackToOriginalScale = z;
    }
}
