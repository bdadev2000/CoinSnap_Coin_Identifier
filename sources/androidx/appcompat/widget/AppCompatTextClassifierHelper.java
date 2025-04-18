package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
final class AppCompatTextClassifierHelper {

    /* renamed from: a, reason: collision with root package name */
    public TextView f1037a;

    /* renamed from: b, reason: collision with root package name */
    public TextClassifier f1038b;

    @RequiresApi
    /* loaded from: classes2.dex */
    public static final class Api26Impl {
        @NonNull
        @DoNotInline
        public static TextClassifier a(@NonNull TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }
}
