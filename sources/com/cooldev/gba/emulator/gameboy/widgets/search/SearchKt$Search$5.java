package com.cooldev.gba.emulator.gameboy.widgets.search;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.l;
import q0.p;

/* loaded from: classes.dex */
public final class SearchKt$Search$5 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $background;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ String $hint;
    final /* synthetic */ boolean $isShowClearButton;
    final /* synthetic */ int $keyboardType;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ a $onClear;
    final /* synthetic */ a $onDone;
    final /* synthetic */ l $onValueChange;
    final /* synthetic */ String $searchText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchKt$Search$5(Modifier modifier, FocusRequester focusRequester, String str, a aVar, l lVar, a aVar2, boolean z2, String str2, boolean z3, long j2, int i2, int i3, int i4, int i5) {
        super(2);
        this.$modifier = modifier;
        this.$focusRequester = focusRequester;
        this.$searchText = str;
        this.$onDone = aVar;
        this.$onValueChange = lVar;
        this.$onClear = aVar2;
        this.$isShowClearButton = z2;
        this.$hint = str2;
        this.$enabled = z3;
        this.$background = j2;
        this.$keyboardType = i2;
        this.$$changed = i3;
        this.$$changed1 = i4;
        this.$$default = i5;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        SearchKt.m408Search4VtiKLc(this.$modifier, this.$focusRequester, this.$searchText, this.$onDone, this.$onValueChange, this.$onClear, this.$isShowClearButton, this.$hint, this.$enabled, this.$background, this.$keyboardType, composer, RecomposeScopeImplKt.a(this.$$changed | 1), RecomposeScopeImplKt.a(this.$$changed1), this.$$default);
    }
}
