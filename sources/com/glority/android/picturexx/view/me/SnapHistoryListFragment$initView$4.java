package com.glority.android.picturexx.view.me;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.PopupMenu;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.picturexx.adapter.MeHistoryItemAdapter;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.view.dialog.ConfirmDeleteDialog;
import com.glority.android.ui.base.v2.BaseFragment;
import com.glority.android.xx.constants.LogEvents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: SnapHistoryListFragment.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u001d\u0010\u0002\u001a\u0019\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00062\u0015\u0010\u0007\u001a\u00110\b¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u00072\u0015\u0010\t\u001a\u00110\n¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\tH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "", "<unused var>", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "Lkotlin/ParameterName;", "name", "adapter", "view", "Landroid/view/View;", "position", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
final class SnapHistoryListFragment$initView$4 extends Lambda implements Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit> {
    final /* synthetic */ SnapHistoryListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapHistoryListFragment$initView$4(SnapHistoryListFragment snapHistoryListFragment) {
        super(3);
        this.this$0 = snapHistoryListFragment;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, Integer num) {
        invoke(baseQuickAdapter, view, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, final View view, final int i) {
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getId() == R.id.iv_me_collection_more) {
            BaseFragment.logEvent$default(this.this$0, LogEvents.historylist_more_click, null, 2, null);
            PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
            popupMenu.getMenuInflater().inflate(R.menu.item_history_menu, popupMenu.getMenu());
            final SnapHistoryListFragment snapHistoryListFragment = this.this$0;
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.glority.android.picturexx.view.me.SnapHistoryListFragment$initView$4$$ExternalSyntheticLambda0
                @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = SnapHistoryListFragment$initView$4.invoke$lambda$0(SnapHistoryListFragment.this, view, i, menuItem);
                    return invoke$lambda$0;
                }
            });
            popupMenu.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$0(final SnapHistoryListFragment this$0, View view, final int i, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        if (menuItem.getItemId() != R.id.option_delete) {
            return true;
        }
        BaseFragment.logEvent$default(this$0, LogEvents.historylist_delete_click, null, 2, null);
        ConfirmDeleteDialog confirmDeleteDialog = ConfirmDeleteDialog.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        confirmDeleteDialog.openFromCollection(context, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.me.SnapHistoryListFragment$initView$4$1$1
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
                MeHistoryItemAdapter meHistoryItemAdapter;
                MeHistoryItemAdapter meHistoryItemAdapter2;
                BaseFragment.logEvent$default(SnapHistoryListFragment.this, LogEvents.historylist_deleteconfirm_click, null, 2, null);
                int i2 = i;
                meHistoryItemAdapter = SnapHistoryListFragment.this.adapter;
                if (i2 < meHistoryItemAdapter.getData().size()) {
                    SnapHistoryListFragment snapHistoryListFragment = SnapHistoryListFragment.this;
                    meHistoryItemAdapter2 = snapHistoryListFragment.adapter;
                    snapHistoryListFragment.deleteItem(meHistoryItemAdapter2.getData().get(i).getItemId());
                }
            }
        });
        return true;
    }
}
