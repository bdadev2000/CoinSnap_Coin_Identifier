package androidx.compose.ui.text.input;

import android.support.v4.media.d;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class EditProcessor$generateBatchErrorMessage$1$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EditCommand f17322a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditProcessor f17323b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProcessor$generateBatchErrorMessage$1$1(EditCommand editCommand, EditProcessor editProcessor) {
        super(1);
        this.f17322a = editCommand;
        this.f17323b = editProcessor;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        String concat;
        EditCommand editCommand = (EditCommand) obj;
        StringBuilder q2 = androidx.compose.foundation.text.input.a.q(this.f17322a == editCommand ? " > " : "   ");
        this.f17323b.getClass();
        if (editCommand instanceof CommitTextCommand) {
            StringBuilder sb = new StringBuilder("CommitTextCommand(text.length=");
            CommitTextCommand commitTextCommand = (CommitTextCommand) editCommand;
            sb.append(commitTextCommand.f17296a.f16880a.length());
            sb.append(", newCursorPosition=");
            concat = d.o(sb, commitTextCommand.f17297b, ')');
        } else if (editCommand instanceof SetComposingTextCommand) {
            StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text.length=");
            SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) editCommand;
            sb2.append(setComposingTextCommand.f17357a.f16880a.length());
            sb2.append(", newCursorPosition=");
            concat = d.o(sb2, setComposingTextCommand.f17358b, ')');
        } else if (editCommand instanceof SetComposingRegionCommand) {
            concat = editCommand.toString();
        } else if (editCommand instanceof DeleteSurroundingTextCommand) {
            concat = editCommand.toString();
        } else if (editCommand instanceof DeleteSurroundingTextInCodePointsCommand) {
            concat = editCommand.toString();
        } else if (editCommand instanceof SetSelectionCommand) {
            concat = editCommand.toString();
        } else if (editCommand instanceof FinishComposingTextCommand) {
            concat = editCommand.toString();
        } else if (editCommand instanceof BackspaceCommand) {
            concat = editCommand.toString();
        } else if (editCommand instanceof MoveCursorCommand) {
            concat = editCommand.toString();
        } else if (editCommand instanceof DeleteAllCommand) {
            concat = editCommand.toString();
        } else {
            String c2 = g0.a(editCommand.getClass()).c();
            if (c2 == null) {
                c2 = "{anonymous EditCommand}";
            }
            concat = "Unknown EditCommand: ".concat(c2);
        }
        q2.append(concat);
        return q2.toString();
    }
}
