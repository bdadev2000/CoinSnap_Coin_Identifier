package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes2.dex */
final class AndroidLegacyPlatformTextInputServiceAdapter$startInput$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f6318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AndroidLegacyPlatformTextInputServiceAdapter f6319b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImeOptions f6320c;
    public final /* synthetic */ l d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f6321f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLegacyPlatformTextInputServiceAdapter$startInput$1(TextFieldValue textFieldValue, AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, ImeOptions imeOptions, l lVar, l lVar2) {
        super(1);
        this.f6318a = textFieldValue;
        this.f6319b = androidLegacyPlatformTextInputServiceAdapter;
        this.f6320c = imeOptions;
        this.d = lVar;
        this.f6321f = lVar2;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        LegacyTextInputMethodRequest legacyTextInputMethodRequest = (LegacyTextInputMethodRequest) obj;
        LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode = this.f6319b.f6446a;
        legacyTextInputMethodRequest.f6454h = this.f6318a;
        legacyTextInputMethodRequest.f6455i = this.f6320c;
        legacyTextInputMethodRequest.f6451c = this.d;
        legacyTextInputMethodRequest.d = this.f6321f;
        legacyTextInputMethodRequest.e = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.M1() : null;
        legacyTextInputMethodRequest.f6452f = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.l1() : null;
        legacyTextInputMethodRequest.f6453g = legacyPlatformTextInputNode != null ? legacyPlatformTextInputNode.getViewConfiguration() : null;
        return b0.f30125a;
    }
}
