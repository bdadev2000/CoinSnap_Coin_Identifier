package com.glority.android.picturexx.view.me;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.PopupMenu;
import androidx.fragment.app.FragmentActivity;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.picturexx.adapter.CustomSeriesCardAdapter;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.definition.SelectableItem;
import com.glority.android.picturexx.recognize.CoreActivity;
import com.glority.android.picturexx.recognize.logevents.RecognizeLogEvents;
import com.glority.android.picturexx.view.dialog.ConfirmDeleteDialog;
import com.glority.android.picturexx.view.dialog.CustomSeriesRenameDialog;
import com.glority.android.picturexx.vm.CollectionViewModel;
import com.glority.android.picturexx.vm.MainRecognizeProcess;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.ui.base.v2.BaseFragment;
import com.glority.android.xx.constants.KeyLogEvents;
import com.glority.android.xx.constants.LogEvents;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MeCollectionMySetsPageFragment.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u001d\u0010\u0002\u001a\u0019\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00072\u0015\u0010\t\u001a\u00110\n¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\tH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "", "<unused var>", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "Lkotlin/ParameterName;", "name", "adapter", "view", "Landroid/view/View;", "position", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class MeCollectionMySetsPageFragment$initView$3 extends Lambda implements Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit> {
    final /* synthetic */ MeCollectionMySetsPageFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeCollectionMySetsPageFragment$initView$3(MeCollectionMySetsPageFragment meCollectionMySetsPageFragment) {
        super(3);
        this.this$0 = meCollectionMySetsPageFragment;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, Integer num) {
        invoke(baseQuickAdapter, view, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, final View view, final int i) {
        CustomSeriesCardAdapter customSeriesCardAdapter;
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "view");
        customSeriesCardAdapter = this.this$0.adapter;
        final SelectableItem selectableItem = (SelectableItem) CollectionsKt.getOrNull(customSeriesCardAdapter.getData(), i);
        if (selectableItem == null) {
            return;
        }
        final int customSeriesId = selectableItem.getUserCustomSeriesItem().getCustomSeriesId();
        if (view.getId() == R.id.iv_me_series_more) {
            BaseFragment.logEvent$default(this.this$0, LogEvents.Me_My_Sets_More_Click, null, 2, null);
            PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
            popupMenu.getMenuInflater().inflate(R.menu.custom_series_item_menu, popupMenu.getMenu());
            final MeCollectionMySetsPageFragment meCollectionMySetsPageFragment = this.this$0;
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.glority.android.picturexx.view.me.MeCollectionMySetsPageFragment$initView$3$$ExternalSyntheticLambda0
                @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = MeCollectionMySetsPageFragment$initView$3.invoke$lambda$0(MeCollectionMySetsPageFragment.this, view, customSeriesId, selectableItem, i, menuItem);
                    return invoke$lambda$0;
                }
            });
            popupMenu.show();
            return;
        }
        if (view.getId() == R.id.iv_series_collection_folder_1) {
            Bundle newUserIdentifyA = KeyLogEvents.INSTANCE.newUserIdentifyA();
            CoreActivity.Companion companion = CoreActivity.INSTANCE;
            FragmentActivity requireActivity = this.this$0.requireActivity();
            Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
            companion.start((RuntimePermissionActivity) requireActivity, new MainRecognizeProcess(), 2, true, "custom_series_add", RecognizeLogEvents.camera, newUserIdentifyA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$0(final MeCollectionMySetsPageFragment this$0, View view, final int i, SelectableItem item, final int i2, MenuItem menuItem) {
        CollectionViewModel collectionVm;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        Intrinsics.checkNotNullParameter(item, "$item");
        if (menuItem.getItemId() == R.id.option_delete) {
            BaseFragment.logEvent$default(this$0, LogEvents.customseries_listdelete_click, null, 2, null);
            ConfirmDeleteDialog confirmDeleteDialog = ConfirmDeleteDialog.INSTANCE;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            confirmDeleteDialog.deleteCustomSeries(context, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionMySetsPageFragment$initView$3$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    CustomSeriesCardAdapter customSeriesCardAdapter;
                    MeCollectionMySetsPageFragment.this.logEvent(LogEvents.Me_My_Sets_Delete_Click, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("id", Integer.valueOf(i))));
                    int i3 = i2;
                    customSeriesCardAdapter = MeCollectionMySetsPageFragment.this.adapter;
                    if (i3 < customSeriesCardAdapter.getData().size()) {
                        MeCollectionMySetsPageFragment.this.deleteItem(i);
                    }
                }
            });
            return true;
        }
        if (menuItem.getItemId() == R.id.option_rename) {
            this$0.logEvent(LogEvents.Me_My_Sets_Rename_Click, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("id", Integer.valueOf(i))));
            CustomSeriesRenameDialog.INSTANCE.open(this$0.getSupportFragmentManager(), item.getUserCustomSeriesItem());
            return true;
        }
        if (menuItem.getItemId() != R.id.option_export) {
            return true;
        }
        this$0.logEvent(LogEvents.Me_My_Sets_Export_Click, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("id", Integer.valueOf(i))));
        collectionVm = this$0.getCollectionVm();
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        collectionVm.exportSeriesCollection(context2, item.getUserCustomSeriesItem().getCollectionCount(), item.getUserCustomSeriesItem().getCustomSeriesId(), this$0);
        return true;
    }
}
