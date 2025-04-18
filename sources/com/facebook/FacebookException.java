package com.facebook;

import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.errorreport.ErrorReportHandler;
import java.util.Random;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class FacebookException extends RuntimeException {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final long serialVersionUID = 1;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public FacebookException() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m416_init_$lambda0(String str, boolean z2) {
        if (z2) {
            try {
                ErrorReportHandler.save(str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }

    public FacebookException(@Nullable final String str) {
        super(str);
        Random random = new Random();
        if (str == null || !FacebookSdk.isInitialized() || random.nextInt(100) <= 50) {
            return;
        }
        FeatureManager featureManager = FeatureManager.INSTANCE;
        FeatureManager.checkFeature(FeatureManager.Feature.ErrorReport, new FeatureManager.Callback() { // from class: com.facebook.e
            @Override // com.facebook.internal.FeatureManager.Callback
            public final void onCompleted(boolean z2) {
                FacebookException.m416_init_$lambda0(str, z2);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FacebookException(@org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.Object... r4) {
        /*
            r2 = this;
            java.lang.String r0 = "args"
            p0.a.s(r4, r0)
            if (r3 != 0) goto L9
            r3 = 0
            goto L15
        L9:
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            int r0 = r4.length
            java.lang.String r1 = "java.lang.String.format(this, *args)"
            java.lang.String r3 = androidx.compose.foundation.text.input.a.o(r4, r0, r3, r1)
        L15:
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookException.<init>(java.lang.String, java.lang.Object[]):void");
    }

    public FacebookException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }

    public FacebookException(@Nullable Throwable th) {
        super(th);
    }
}
