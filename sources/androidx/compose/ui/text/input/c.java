package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import com.cooldev.gba.emulator.gameboy.features.in_app_review.InAppReviewManager;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements VisualTransformation, OnCompleteListener {
    @Override // androidx.compose.ui.text.input.VisualTransformation
    public TransformedText a(AnnotatedString annotatedString) {
        return new TransformedText(annotatedString, OffsetMapping.Companion.f17345a);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        InAppReviewManager.startInAppReview$lambda$1$lambda$0(task);
    }
}
