package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.util.List;

/* loaded from: classes.dex */
public class lu {

    /* loaded from: classes.dex */
    public interface Sg {
        void Sg();

        void YFl();

        void YFl(View view, boolean z10);

        void YFl(boolean z10);
    }

    /* loaded from: classes.dex */
    public class YFl implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ ViewGroup Sg;
        View YFl = null;

        public YFl(ViewGroup viewGroup) {
            this.Sg = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                Sg sg2 = (Sg) this.Sg.getTag(520093765);
                if (this.YFl != null) {
                    Rect rect = new Rect();
                    this.YFl.getGlobalVisibleRect(rect);
                    Rect rect2 = new Rect();
                    this.Sg.getGlobalVisibleRect(rect2);
                    if (rect.contains(rect2)) {
                        if (sg2 != null) {
                            sg2.YFl(this.Sg, false);
                        }
                        this.Sg.setTag(520093763, Boolean.FALSE);
                        return;
                    } else {
                        if (sg2 != null) {
                            sg2.YFl(this.Sg, true);
                        }
                        this.Sg.setTag(520093763, Boolean.TRUE);
                        return;
                    }
                }
                ViewGroup viewGroup = this.Sg;
                lu.Sg(viewGroup, sg2, (Integer) viewGroup.getTag(520093766));
            } catch (Exception e2) {
                ApmHelper.reportCustomError("onGlobalLayout exception " + this.Sg.getTag(520093765), "ViewUtils", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Sg(View view, Sg sg2, Integer num) {
        if (sg2 == null) {
            return;
        }
        if (num == null) {
            num = 0;
        }
        if (YFl(view, num.intValue())) {
            sg2.YFl(view, true);
        }
    }

    public static void YFl(final ViewGroup viewGroup, boolean z10, int i10, Sg sg2, List<ViewGroup> list) {
        viewGroup.setTag(520093765, sg2);
        viewGroup.setTag(520093766, Integer.valueOf(i10));
        if (viewGroup.getTag(520093764) == Boolean.TRUE) {
            return;
        }
        final YFl yFl = new YFl(viewGroup);
        if (list != null && list.size() > 0) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                list.get(i11).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.lu.1
                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewAdded(View view, View view2) {
                        YFl.this.YFl = view2;
                    }

                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewRemoved(View view, View view2) {
                        YFl.this.YFl = null;
                    }
                });
            }
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(yFl);
        if (z10) {
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.utils.lu.2
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    try {
                        Sg sg3 = (Sg) viewGroup.getTag(520093765);
                        ViewGroup viewGroup2 = viewGroup;
                        lu.Sg(viewGroup2, sg3, (Integer) viewGroup2.getTag(520093766));
                    } catch (Exception e2) {
                        ApmHelper.reportCustomError("onScrollChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e2);
                    }
                }
            });
        }
        viewGroup.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.lu.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z11) {
                try {
                    Sg sg3 = (Sg) viewGroup.getTag(520093765);
                    if (sg3 != null) {
                        sg3.YFl(z11);
                        ViewGroup viewGroup2 = viewGroup;
                        lu.Sg(viewGroup2, sg3, (Integer) viewGroup2.getTag(520093766));
                    }
                } catch (Exception e2) {
                    ApmHelper.reportCustomError("onWindowFocusChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e2);
                }
            }
        });
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.lu.4
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                Sg sg3 = (Sg) viewGroup.getTag(520093765);
                if (sg3 != null) {
                    sg3.YFl();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                Sg sg3 = (Sg) viewGroup.getTag(520093765);
                if (sg3 != null) {
                    sg3.Sg();
                }
            }
        });
        viewGroup.setTag(520093764, Boolean.TRUE);
    }

    private static boolean YFl(View view, int i10) {
        return com.bytedance.sdk.openadsdk.core.pq.YFl(view, 20, i10);
    }
}
