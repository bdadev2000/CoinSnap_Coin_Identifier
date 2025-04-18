package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19887b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19888c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(Object obj, View view, Object obj2, int i2) {
        this.f19886a = i2;
        this.f19887b = obj;
        this.f19888c = view;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f19886a;
        Object obj = this.d;
        Object obj2 = this.f19888c;
        Object obj3 = this.f19887b;
        switch (i2) {
            case 0:
                DefaultSpecialEffectsController defaultSpecialEffectsController = (DefaultSpecialEffectsController) obj3;
                DefaultSpecialEffectsController.AnimationInfo animationInfo = (DefaultSpecialEffectsController.AnimationInfo) obj;
                p0.a.s(defaultSpecialEffectsController, "this$0");
                p0.a.s(animationInfo, "$animationInfo");
                defaultSpecialEffectsController.f19861a.endViewTransition((View) obj2);
                animationInfo.a();
                return;
            case 1:
                List list = (List) obj2;
                SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) obj;
                p0.a.s(list, "$awaitingContainerChanges");
                p0.a.s(operation, "$operation");
                p0.a.s((DefaultSpecialEffectsController) obj3, "this$0");
                if (list.contains(operation)) {
                    list.remove(operation);
                    View view = operation.f19867c.mView;
                    SpecialEffectsController.Operation.State state = operation.f19865a;
                    p0.a.r(view, ViewHierarchyConstants.VIEW_KEY);
                    state.a(view);
                    return;
                }
                return;
            default:
                Rect rect = (Rect) obj;
                p0.a.s((FragmentTransitionImpl) obj3, "$impl");
                p0.a.s(rect, "$lastInEpicenterRect");
                FragmentTransitionImpl.g(rect, (View) obj2);
                return;
        }
    }

    public /* synthetic */ d(ArrayList arrayList, SpecialEffectsController.Operation operation, DefaultSpecialEffectsController defaultSpecialEffectsController) {
        this.f19886a = 1;
        this.f19888c = arrayList;
        this.d = operation;
        this.f19887b = defaultSpecialEffectsController;
    }
}
