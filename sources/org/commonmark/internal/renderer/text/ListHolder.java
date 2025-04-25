package org.commonmark.internal.renderer.text;

/* loaded from: classes9.dex */
public abstract class ListHolder {
    private static final String INDENT_DEFAULT = "   ";
    private static final String INDENT_EMPTY = "";
    private final String indent;
    private final ListHolder parent;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ListHolder(ListHolder listHolder) {
        this.parent = listHolder;
        if (listHolder != null) {
            this.indent = listHolder.indent + INDENT_DEFAULT;
        } else {
            this.indent = "";
        }
    }

    public ListHolder getParent() {
        return this.parent;
    }

    public String getIndent() {
        return this.indent;
    }
}
