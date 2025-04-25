package com.glority.android.picturexx.view.dialog;

import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.PopupMenu;
import com.glority.android.picturexx.business.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectionMorePopup.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00050\t¨\u0006\u000e"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/CollectionMorePopup;", "", "<init>", "()V", "show", "", "anchorView", "Landroid/view/View;", "onMenuClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "menuId", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CollectionMorePopup {
    public static final int $stable = 0;
    public static final CollectionMorePopup INSTANCE = new CollectionMorePopup();

    private CollectionMorePopup() {
    }

    public final void show(View anchorView, final Function1<? super Integer, Unit> onMenuClick) {
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        Intrinsics.checkNotNullParameter(onMenuClick, "onMenuClick");
        PopupMenu popupMenu = new PopupMenu(anchorView.getContext(), anchorView);
        popupMenu.getMenuInflater().inflate(R.menu.item_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.glority.android.picturexx.view.dialog.CollectionMorePopup$$ExternalSyntheticLambda0
            @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean show$lambda$0;
                show$lambda$0 = CollectionMorePopup.show$lambda$0(Function1.this, menuItem);
                return show$lambda$0;
            }
        });
        popupMenu.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean show$lambda$0(Function1 onMenuClick, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(onMenuClick, "$onMenuClick");
        onMenuClick.invoke(Integer.valueOf(menuItem.getItemId()));
        return true;
    }
}
