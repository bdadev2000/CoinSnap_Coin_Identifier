package org.commonmark.internal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.commonmark.internal.BlockQuoteParser;
import org.commonmark.internal.FencedCodeBlockParser;
import org.commonmark.internal.HeadingParser;
import org.commonmark.internal.HtmlBlockParser;
import org.commonmark.internal.IndentedCodeBlockParser;
import org.commonmark.internal.ListBlockParser;
import org.commonmark.internal.ThematicBreakParser;
import org.commonmark.internal.util.Parsing;
import org.commonmark.node.Block;
import org.commonmark.node.BlockQuote;
import org.commonmark.node.Document;
import org.commonmark.node.FencedCodeBlock;
import org.commonmark.node.Heading;
import org.commonmark.node.HtmlBlock;
import org.commonmark.node.IndentedCodeBlock;
import org.commonmark.node.LinkReferenceDefinition;
import org.commonmark.node.ListBlock;
import org.commonmark.node.ThematicBreak;
import org.commonmark.parser.InlineParser;
import org.commonmark.parser.InlineParserFactory;
import org.commonmark.parser.block.BlockParser;
import org.commonmark.parser.block.BlockParserFactory;
import org.commonmark.parser.block.BlockStart;
import org.commonmark.parser.block.MatchedBlockParser;
import org.commonmark.parser.block.ParserState;
import org.commonmark.parser.delimiter.DelimiterProcessor;

/* loaded from: classes9.dex */
public class DocumentParser implements ParserState {
    private static final Set<Class<? extends Block>> CORE_FACTORY_TYPES = new LinkedHashSet(Arrays.asList(BlockQuote.class, Heading.class, FencedCodeBlock.class, HtmlBlock.class, ThematicBreak.class, ListBlock.class, IndentedCodeBlock.class));
    private static final Map<Class<? extends Block>, BlockParserFactory> NODES_TO_CORE_FACTORIES;
    private boolean blank;
    private final List<BlockParserFactory> blockParserFactories;
    private boolean columnIsInTab;
    private final List<DelimiterProcessor> delimiterProcessors;
    private final DocumentBlockParser documentBlockParser;
    private final InlineParserFactory inlineParserFactory;
    private CharSequence line;
    private int index = 0;
    private int column = 0;
    private int nextNonSpace = 0;
    private int nextNonSpaceColumn = 0;
    private int indent = 0;
    private final Map<String, LinkReferenceDefinition> definitions = new LinkedHashMap();
    private List<BlockParser> activeBlockParsers = new ArrayList();
    private Set<BlockParser> allBlockParsers = new LinkedHashSet();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(BlockQuote.class, new BlockQuoteParser.Factory());
        hashMap.put(Heading.class, new HeadingParser.Factory());
        hashMap.put(FencedCodeBlock.class, new FencedCodeBlockParser.Factory());
        hashMap.put(HtmlBlock.class, new HtmlBlockParser.Factory());
        hashMap.put(ThematicBreak.class, new ThematicBreakParser.Factory());
        hashMap.put(ListBlock.class, new ListBlockParser.Factory());
        hashMap.put(IndentedCodeBlock.class, new IndentedCodeBlockParser.Factory());
        NODES_TO_CORE_FACTORIES = Collections.unmodifiableMap(hashMap);
    }

    public DocumentParser(List<BlockParserFactory> list, InlineParserFactory inlineParserFactory, List<DelimiterProcessor> list2) {
        this.blockParserFactories = list;
        this.inlineParserFactory = inlineParserFactory;
        this.delimiterProcessors = list2;
        DocumentBlockParser documentBlockParser = new DocumentBlockParser();
        this.documentBlockParser = documentBlockParser;
        activateBlockParser(documentBlockParser);
    }

    public static Set<Class<? extends Block>> getDefaultBlockParserTypes() {
        return CORE_FACTORY_TYPES;
    }

    public static List<BlockParserFactory> calculateBlockParserFactories(List<BlockParserFactory> list, Set<Class<? extends Block>> set) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        Iterator<Class<? extends Block>> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(NODES_TO_CORE_FACTORIES.get(it.next()));
        }
        return arrayList;
    }

    public Document parse(String str) {
        int i = 0;
        while (true) {
            int findLineBreak = Parsing.findLineBreak(str, i);
            if (findLineBreak == -1) {
                break;
            }
            incorporateLine(str.substring(i, findLineBreak));
            i = findLineBreak + 1;
            if (i < str.length() && str.charAt(findLineBreak) == '\r' && str.charAt(i) == '\n') {
                i = findLineBreak + 2;
            }
        }
        if (str.length() > 0 && (i == 0 || i < str.length())) {
            incorporateLine(str.substring(i));
        }
        return finalizeAndProcess();
    }

    public Document parse(Reader reader) throws IOException {
        BufferedReader bufferedReader;
        if (reader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) reader;
        } else {
            bufferedReader = new BufferedReader(reader);
        }
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                incorporateLine(readLine);
            } else {
                return finalizeAndProcess();
            }
        }
    }

    @Override // org.commonmark.parser.block.ParserState
    public CharSequence getLine() {
        return this.line;
    }

    @Override // org.commonmark.parser.block.ParserState
    public int getIndex() {
        return this.index;
    }

    @Override // org.commonmark.parser.block.ParserState
    public int getNextNonSpaceIndex() {
        return this.nextNonSpace;
    }

    @Override // org.commonmark.parser.block.ParserState
    public int getColumn() {
        return this.column;
    }

    @Override // org.commonmark.parser.block.ParserState
    public int getIndent() {
        return this.indent;
    }

    @Override // org.commonmark.parser.block.ParserState
    public boolean isBlank() {
        return this.blank;
    }

    @Override // org.commonmark.parser.block.ParserState
    public BlockParser getActiveBlockParser() {
        return this.activeBlockParsers.get(r0.size() - 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f7, code lost:
    
        setNewIndex(r10.nextNonSpace);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void incorporateLine(java.lang.CharSequence r11) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.commonmark.internal.DocumentParser.incorporateLine(java.lang.CharSequence):void");
    }

    private void findNextNonSpace() {
        int i = this.index;
        int i2 = this.column;
        this.blank = true;
        int length = this.line.length();
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = this.line.charAt(i);
            if (charAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (charAt != ' ') {
                this.blank = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.nextNonSpace = i;
        this.nextNonSpaceColumn = i2;
        this.indent = i2 - this.column;
    }

    private void setNewIndex(int i) {
        int i2 = this.nextNonSpace;
        if (i >= i2) {
            this.index = i2;
            this.column = this.nextNonSpaceColumn;
        }
        int length = this.line.length();
        while (true) {
            int i3 = this.index;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                advance();
            }
        }
        this.columnIsInTab = false;
    }

    private void setNewColumn(int i) {
        int i2;
        int i3 = this.nextNonSpaceColumn;
        if (i >= i3) {
            this.index = this.nextNonSpace;
            this.column = i3;
        }
        int length = this.line.length();
        while (true) {
            i2 = this.column;
            if (i2 >= i || this.index == length) {
                break;
            } else {
                advance();
            }
        }
        if (i2 > i) {
            this.index--;
            this.column = i;
            this.columnIsInTab = true;
            return;
        }
        this.columnIsInTab = false;
    }

    private void advance() {
        if (this.line.charAt(this.index) == '\t') {
            this.index++;
            int i = this.column;
            this.column = i + Parsing.columnsToNextTabStop(i);
        } else {
            this.index++;
            this.column++;
        }
    }

    private void addLine() {
        CharSequence subSequence;
        if (this.columnIsInTab) {
            int i = this.index + 1;
            CharSequence charSequence = this.line;
            CharSequence subSequence2 = charSequence.subSequence(i, charSequence.length());
            int columnsToNextTabStop = Parsing.columnsToNextTabStop(this.column);
            StringBuilder sb = new StringBuilder(subSequence2.length() + columnsToNextTabStop);
            for (int i2 = 0; i2 < columnsToNextTabStop; i2++) {
                sb.append(' ');
            }
            sb.append(subSequence2);
            subSequence = sb.toString();
        } else {
            CharSequence charSequence2 = this.line;
            subSequence = charSequence2.subSequence(this.index, charSequence2.length());
        }
        getActiveBlockParser().addLine(subSequence);
    }

    private BlockStartImpl findBlockStart(BlockParser blockParser) {
        MatchedBlockParserImpl matchedBlockParserImpl = new MatchedBlockParserImpl(blockParser);
        Iterator<BlockParserFactory> it = this.blockParserFactories.iterator();
        while (it.hasNext()) {
            BlockStart tryStart = it.next().tryStart(this, matchedBlockParserImpl);
            if (tryStart instanceof BlockStartImpl) {
                return (BlockStartImpl) tryStart;
            }
        }
        return null;
    }

    private void finalize(BlockParser blockParser) {
        if (getActiveBlockParser() == blockParser) {
            deactivateBlockParser();
        }
        if (blockParser instanceof ParagraphParser) {
            addDefinitionsFrom((ParagraphParser) blockParser);
        }
        blockParser.closeBlock();
    }

    private void addDefinitionsFrom(ParagraphParser paragraphParser) {
        for (LinkReferenceDefinition linkReferenceDefinition : paragraphParser.getDefinitions()) {
            paragraphParser.getBlock().insertBefore(linkReferenceDefinition);
            String label = linkReferenceDefinition.getLabel();
            if (!this.definitions.containsKey(label)) {
                this.definitions.put(label, linkReferenceDefinition);
            }
        }
    }

    private void processInlines() {
        InlineParser create = this.inlineParserFactory.create(new InlineParserContextImpl(this.delimiterProcessors, this.definitions));
        Iterator<BlockParser> it = this.allBlockParsers.iterator();
        while (it.hasNext()) {
            it.next().parseInlines(create);
        }
    }

    private <T extends BlockParser> T addChild(T t) {
        while (!getActiveBlockParser().canContain(t.getBlock())) {
            finalize(getActiveBlockParser());
        }
        getActiveBlockParser().getBlock().appendChild(t.getBlock());
        activateBlockParser(t);
        return t;
    }

    private void activateBlockParser(BlockParser blockParser) {
        this.activeBlockParsers.add(blockParser);
        this.allBlockParsers.add(blockParser);
    }

    private void deactivateBlockParser() {
        this.activeBlockParsers.remove(r0.size() - 1);
    }

    private void prepareActiveBlockParserForReplacement() {
        BlockParser activeBlockParser = getActiveBlockParser();
        deactivateBlockParser();
        this.allBlockParsers.remove(activeBlockParser);
        if (activeBlockParser instanceof ParagraphParser) {
            addDefinitionsFrom((ParagraphParser) activeBlockParser);
        }
        activeBlockParser.getBlock().unlink();
    }

    private void finalizeBlocks(List<BlockParser> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            finalize(list.get(size));
        }
    }

    private Document finalizeAndProcess() {
        finalizeBlocks(this.activeBlockParsers);
        processInlines();
        return this.documentBlockParser.getBlock();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class MatchedBlockParserImpl implements MatchedBlockParser {
        private final BlockParser matchedBlockParser;

        public MatchedBlockParserImpl(BlockParser blockParser) {
            this.matchedBlockParser = blockParser;
        }

        @Override // org.commonmark.parser.block.MatchedBlockParser
        public BlockParser getMatchedBlockParser() {
            return this.matchedBlockParser;
        }

        @Override // org.commonmark.parser.block.MatchedBlockParser
        public CharSequence getParagraphContent() {
            BlockParser blockParser = this.matchedBlockParser;
            if (!(blockParser instanceof ParagraphParser)) {
                return null;
            }
            CharSequence contentString = ((ParagraphParser) blockParser).getContentString();
            if (contentString.length() == 0) {
                return null;
            }
            return contentString;
        }
    }
}
