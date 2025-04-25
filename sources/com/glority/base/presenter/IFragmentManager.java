package com.glority.base.presenter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IFragmentManager.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J+\u0010\u0004\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/glority/base/presenter/IFragmentManager;", "", "getSupportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "transact", "", "block", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentTransaction;", "Lkotlin/ParameterName;", "name", "fragmentTransaction", "findFragmentById", "Landroidx/fragment/app/Fragment;", "id", "", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public interface IFragmentManager {
    Fragment findFragmentById(int id);

    FragmentManager getSupportFragmentManager();

    void transact(Function1<? super FragmentTransaction, Unit> block);

    /* compiled from: IFragmentManager.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static void transact(IFragmentManager iFragmentManager, Function1<? super FragmentTransaction, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            FragmentTransaction beginTransaction = iFragmentManager.getSupportFragmentManager().beginTransaction();
            Intrinsics.checkNotNullExpressionValue(beginTransaction, "beginTransaction(...)");
            block.invoke(beginTransaction);
            Unit unit = Unit.INSTANCE;
            beginTransaction.commit();
        }

        public static Fragment findFragmentById(IFragmentManager iFragmentManager, int i) {
            return iFragmentManager.getSupportFragmentManager().findFragmentById(i);
        }
    }
}
