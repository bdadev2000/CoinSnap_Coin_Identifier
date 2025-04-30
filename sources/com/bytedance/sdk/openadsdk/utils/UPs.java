package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.util.List;

/* loaded from: classes.dex */
public class UPs {

    /* loaded from: classes.dex */
    public interface lMd {
        void lMd();

        void zp();

        void zp(View view, boolean z8);

        void zp(boolean z8);
    }

    /* loaded from: classes.dex */
    public class zp implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ ViewGroup lMd;
        View zp = null;

        public zp(ViewGroup viewGroup) {
            this.lMd = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                lMd lmd = (lMd) this.lMd.getTag(520093765);
                if (this.zp != null) {
                    Rect rect = new Rect();
                    this.zp.getGlobalVisibleRect(rect);
                    Rect rect2 = new Rect();
                    this.lMd.getGlobalVisibleRect(rect2);
                    if (rect.contains(rect2)) {
                        if (lmd != null) {
                            lmd.zp(this.lMd, false);
                        }
                        this.lMd.setTag(520093763, Boolean.FALSE);
                        return;
                    } else {
                        if (lmd != null) {
                            lmd.zp(this.lMd, true);
                        }
                        this.lMd.setTag(520093763, Boolean.TRUE);
                        return;
                    }
                }
                ViewGroup viewGroup = this.lMd;
                UPs.lMd(viewGroup, lmd, (Integer) viewGroup.getTag(520093766));
            } catch (Exception e4) {
                ApmHelper.reportCustomError("onGlobalLayout exception " + this.lMd.getTag(520093765), "ViewUtils", e4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lMd(View view, lMd lmd, Integer num) {
        if (lmd == null) {
            return;
        }
        if (num == null) {
            num = 0;
        }
        if (zp(view, num.intValue())) {
            lmd.zp(view, true);
        }
    }

    public static void zp(final ViewGroup viewGroup, boolean z8, int i9, lMd lmd, List<ViewGroup> list) {
        viewGroup.setTag(520093765, lmd);
        viewGroup.setTag(520093766, Integer.valueOf(i9));
        if (viewGroup.getTag(520093764) == Boolean.TRUE) {
            return;
        }
        final zp zpVar = new zp(viewGroup);
        if (list != null && list.size() > 0) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                list.get(i10).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.UPs.1
                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewAdded(View view, View view2) {
                        zp.this.zp = view2;
                    }

                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewRemoved(View view, View view2) {
                        zp.this.zp = null;
                    }
                });
            }
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(zpVar);
        if (z8) {
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.utils.UPs.2
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    try {
                        lMd lmd2 = (lMd) viewGroup.getTag(520093765);
                        ViewGroup viewGroup2 = viewGroup;
                        UPs.lMd(viewGroup2, lmd2, (Integer) viewGroup2.getTag(520093766));
                    } catch (Exception e4) {
                        ApmHelper.reportCustomError("onScrollChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e4);
                    }
                }
            });
        }
        viewGroup.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.UPs.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z9) {
                try {
                    lMd lmd2 = (lMd) viewGroup.getTag(520093765);
                    if (lmd2 != null) {
                        lmd2.zp(z9);
                        ViewGroup viewGroup2 = viewGroup;
                        UPs.lMd(viewGroup2, lmd2, (Integer) viewGroup2.getTag(520093766));
                    }
                } catch (Exception e4) {
                    ApmHelper.reportCustomError("onWindowFocusChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e4);
                }
            }
        });
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.UPs.4
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                lMd lmd2 = (lMd) viewGroup.getTag(520093765);
                if (lmd2 != null) {
                    lmd2.zp();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                lMd lmd2 = (lMd) viewGroup.getTag(520093765);
                if (lmd2 != null) {
                    lmd2.lMd();
                }
            }
        });
        viewGroup.setTag(520093764, Boolean.TRUE);
    }

    private static boolean zp(View view, int i9) {
        return com.bytedance.sdk.openadsdk.core.Lij.zp(view, 20, i9);
    }
}
