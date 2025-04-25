package com.glority.android.picturexx.view.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.glority.android.cmsui2.bean.VarietyV2Entity;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.DialogVarietySelectBinding;
import com.glority.android.xx.constants.Args;
import com.glority.widget.bottomsheet.GlBottomSheetBuilder;
import com.glority.widget.bottomsheet.GlBottomSheetDialog;
import com.glority.widget.wheelpicker.GlWheelPickerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VarietySelectDialog.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00050\u000e¨\u0006\u000f"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/VarietySelectDialog;", "", "<init>", "()V", "show", "", "context", "Landroid/content/Context;", "varietyList", "", "Lcom/glority/android/cmsui2/bean/VarietyV2Entity;", Args.varietyUid, "", "selected", "Lkotlin/Function1;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class VarietySelectDialog {
    public static final int $stable = 0;
    public static final VarietySelectDialog INSTANCE = new VarietySelectDialog();

    private VarietySelectDialog() {
    }

    public final void show(Context context, final List<VarietyV2Entity> varietyList, String varietyUid, final Function1<? super VarietyV2Entity, Unit> selected) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(varietyList, "varietyList");
        Intrinsics.checkNotNullParameter(varietyUid, "varietyUid");
        Intrinsics.checkNotNullParameter(selected, "selected");
        String string = context.getString(R.string.coinselect_selectgrade_option_uncertain);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        final DialogVarietySelectBinding inflate = DialogVarietySelectBinding.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        GlWheelPickerView glWheelPickerView = inflate.wheel1;
        List<VarietyV2Entity> list = varietyList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((VarietyV2Entity) it.next()).getMintmark());
        }
        List<String> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        mutableList.add(string);
        glWheelPickerView.setData(mutableList);
        GlWheelPickerView glWheelPickerView2 = inflate.wheel1;
        Iterator<VarietyV2Entity> it2 = varietyList.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(it2.next().getVarietyUid(), varietyUid)) {
                break;
            } else {
                i++;
            }
        }
        glWheelPickerView2.setSelectedItemPosition(i, false);
        GlBottomSheetBuilder glBottomSheetBuilder = new GlBottomSheetBuilder(context);
        View root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        final GlBottomSheetDialog show = glBottomSheetBuilder.setCustomView(root).showDimBehind(true).show(3);
        TextView tvCancel = inflate.tvCancel;
        Intrinsics.checkNotNullExpressionValue(tvCancel, "tvCancel");
        ViewExtensionsKt.setSingleClickListener$default(tvCancel, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.dialog.VarietySelectDialog$show$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it3) {
                Intrinsics.checkNotNullParameter(it3, "it");
                GlBottomSheetDialog.this.dismiss();
            }
        }, 1, (Object) null);
        TextView tvDone = inflate.tvDone;
        Intrinsics.checkNotNullExpressionValue(tvDone, "tvDone");
        ViewExtensionsKt.setSingleClickListener$default(tvDone, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.dialog.VarietySelectDialog$show$5
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it3) {
                Intrinsics.checkNotNullParameter(it3, "it");
                selected.invoke(CollectionsKt.getOrNull(varietyList, inflate.wheel1.getCurrentItemPosition()));
                show.dismiss();
            }
        }, 1, (Object) null);
        show.setDismissWithAnimation(true);
        show.show();
    }
}
