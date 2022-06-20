// Generated from TOCLParser.g4 by ANTLR 4.9.3
package org.tzi.use.STMPlugin.logic.tocl2ocl;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TOCLParser}.
 */
public interface TOCLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TOCLParser#expressionInOcl}.
	 * @param ctx the parse tree
	 */
	void enterExpressionInOcl(TOCLParser.ExpressionInOclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#expressionInOcl}.
	 * @param ctx the parse tree
	 */
	void exitExpressionInOcl(TOCLParser.ExpressionInOclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#oclExpression}.
	 * @param ctx the parse tree
	 */
	void enterOclExpression(TOCLParser.OclExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#oclExpression}.
	 * @param ctx the parse tree
	 */
	void exitOclExpression(TOCLParser.OclExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#varExp}.
	 * @param ctx the parse tree
	 */
	void enterVarExp(TOCLParser.VarExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#varExp}.
	 * @param ctx the parse tree
	 */
	void exitVarExp(TOCLParser.VarExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#simpleName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleName(TOCLParser.SimpleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#simpleName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleName(TOCLParser.SimpleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#restrictedKeyword}.
	 * @param ctx the parse tree
	 */
	void enterRestrictedKeyword(TOCLParser.RestrictedKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#restrictedKeyword}.
	 * @param ctx the parse tree
	 */
	void exitRestrictedKeyword(TOCLParser.RestrictedKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#unreservedSimpleName}.
	 * @param ctx the parse tree
	 */
	void enterUnreservedSimpleName(TOCLParser.UnreservedSimpleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#unreservedSimpleName}.
	 * @param ctx the parse tree
	 */
	void exitUnreservedSimpleName(TOCLParser.UnreservedSimpleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#pathName}.
	 * @param ctx the parse tree
	 */
	void enterPathName(TOCLParser.PathNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#pathName}.
	 * @param ctx the parse tree
	 */
	void exitPathName(TOCLParser.PathNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#literalExp}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExp(TOCLParser.LiteralExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#literalExp}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExp(TOCLParser.LiteralExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#enumLiteralExp}.
	 * @param ctx the parse tree
	 */
	void enterEnumLiteralExp(TOCLParser.EnumLiteralExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#enumLiteralExp}.
	 * @param ctx the parse tree
	 */
	void exitEnumLiteralExp(TOCLParser.EnumLiteralExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#collectionLiteralExp}.
	 * @param ctx the parse tree
	 */
	void enterCollectionLiteralExp(TOCLParser.CollectionLiteralExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#collectionLiteralExp}.
	 * @param ctx the parse tree
	 */
	void exitCollectionLiteralExp(TOCLParser.CollectionLiteralExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#collectionTypeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterCollectionTypeIdentifier(TOCLParser.CollectionTypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#collectionTypeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitCollectionTypeIdentifier(TOCLParser.CollectionTypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#collectionLiteralParts}.
	 * @param ctx the parse tree
	 */
	void enterCollectionLiteralParts(TOCLParser.CollectionLiteralPartsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#collectionLiteralParts}.
	 * @param ctx the parse tree
	 */
	void exitCollectionLiteralParts(TOCLParser.CollectionLiteralPartsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#collectionLiteralPart}.
	 * @param ctx the parse tree
	 */
	void enterCollectionLiteralPart(TOCLParser.CollectionLiteralPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#collectionLiteralPart}.
	 * @param ctx the parse tree
	 */
	void exitCollectionLiteralPart(TOCLParser.CollectionLiteralPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#collectionRange}.
	 * @param ctx the parse tree
	 */
	void enterCollectionRange(TOCLParser.CollectionRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#collectionRange}.
	 * @param ctx the parse tree
	 */
	void exitCollectionRange(TOCLParser.CollectionRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#primitiveLiteralExp}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveLiteralExp(TOCLParser.PrimitiveLiteralExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#primitiveLiteralExp}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveLiteralExp(TOCLParser.PrimitiveLiteralExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#tupleLiteralExp}.
	 * @param ctx the parse tree
	 */
	void enterTupleLiteralExp(TOCLParser.TupleLiteralExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#tupleLiteralExp}.
	 * @param ctx the parse tree
	 */
	void exitTupleLiteralExp(TOCLParser.TupleLiteralExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#unlimitedNaturalLiteralExp}.
	 * @param ctx the parse tree
	 */
	void enterUnlimitedNaturalLiteralExp(TOCLParser.UnlimitedNaturalLiteralExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#unlimitedNaturalLiteralExp}.
	 * @param ctx the parse tree
	 */
	void exitUnlimitedNaturalLiteralExp(TOCLParser.UnlimitedNaturalLiteralExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#integerLiteralExp}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteralExp(TOCLParser.IntegerLiteralExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#integerLiteralExp}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteralExp(TOCLParser.IntegerLiteralExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#realLiteralExp}.
	 * @param ctx the parse tree
	 */
	void enterRealLiteralExp(TOCLParser.RealLiteralExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#realLiteralExp}.
	 * @param ctx the parse tree
	 */
	void exitRealLiteralExp(TOCLParser.RealLiteralExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#stringLiteralExp}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralExp(TOCLParser.StringLiteralExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#stringLiteralExp}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralExp(TOCLParser.StringLiteralExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#booleanLiteralExp}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteralExp(TOCLParser.BooleanLiteralExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#booleanLiteralExp}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteralExp(TOCLParser.BooleanLiteralExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#binaryOperationExp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperationExp(TOCLParser.BinaryOperationExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#binaryOperationExp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperationExp(TOCLParser.BinaryOperationExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#orExp}.
	 * @param ctx the parse tree
	 */
	void enterOrExp(TOCLParser.OrExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#orExp}.
	 * @param ctx the parse tree
	 */
	void exitOrExp(TOCLParser.OrExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#xorExp}.
	 * @param ctx the parse tree
	 */
	void enterXorExp(TOCLParser.XorExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#xorExp}.
	 * @param ctx the parse tree
	 */
	void exitXorExp(TOCLParser.XorExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#andExp}.
	 * @param ctx the parse tree
	 */
	void enterAndExp(TOCLParser.AndExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#andExp}.
	 * @param ctx the parse tree
	 */
	void exitAndExp(TOCLParser.AndExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#equalityExp}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExp(TOCLParser.EqualityExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#equalityExp}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExp(TOCLParser.EqualityExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#relationalExp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExp(TOCLParser.RelationalExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#relationalExp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExp(TOCLParser.RelationalExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#additiveExp}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExp(TOCLParser.AdditiveExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#additiveExp}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExp(TOCLParser.AdditiveExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#multiplicativeExp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExp(TOCLParser.MultiplicativeExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#multiplicativeExp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExp(TOCLParser.MultiplicativeExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp(TOCLParser.UnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp(TOCLParser.UnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#postfixExp}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExp(TOCLParser.PostfixExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#postfixExp}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExp(TOCLParser.PostfixExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExp(TOCLParser.PrimaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExp(TOCLParser.PrimaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#callExp}.
	 * @param ctx the parse tree
	 */
	void enterCallExp(TOCLParser.CallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#callExp}.
	 * @param ctx the parse tree
	 */
	void exitCallExp(TOCLParser.CallExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#loopExp}.
	 * @param ctx the parse tree
	 */
	void enterLoopExp(TOCLParser.LoopExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#loopExp}.
	 * @param ctx the parse tree
	 */
	void exitLoopExp(TOCLParser.LoopExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#oclQueryExp}.
	 * @param ctx the parse tree
	 */
	void enterOclQueryExp(TOCLParser.OclQueryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#oclQueryExp}.
	 * @param ctx the parse tree
	 */
	void exitOclQueryExp(TOCLParser.OclQueryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#oclOperationIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterOclOperationIdentifier(TOCLParser.OclOperationIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#oclOperationIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitOclOperationIdentifier(TOCLParser.OclOperationIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#iterateExp}.
	 * @param ctx the parse tree
	 */
	void enterIterateExp(TOCLParser.IterateExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#iterateExp}.
	 * @param ctx the parse tree
	 */
	void exitIterateExp(TOCLParser.IterateExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(TOCLParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(TOCLParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TOCLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TOCLParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(TOCLParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(TOCLParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#oclType}.
	 * @param ctx the parse tree
	 */
	void enterOclType(TOCLParser.OclTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#oclType}.
	 * @param ctx the parse tree
	 */
	void exitOclType(TOCLParser.OclTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#collectionType}.
	 * @param ctx the parse tree
	 */
	void enterCollectionType(TOCLParser.CollectionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#collectionType}.
	 * @param ctx the parse tree
	 */
	void exitCollectionType(TOCLParser.CollectionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#tupleType}.
	 * @param ctx the parse tree
	 */
	void enterTupleType(TOCLParser.TupleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#tupleType}.
	 * @param ctx the parse tree
	 */
	void exitTupleType(TOCLParser.TupleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationList(TOCLParser.VariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationList(TOCLParser.VariableDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#featureCallExp}.
	 * @param ctx the parse tree
	 */
	void enterFeatureCallExp(TOCLParser.FeatureCallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#featureCallExp}.
	 * @param ctx the parse tree
	 */
	void exitFeatureCallExp(TOCLParser.FeatureCallExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#oclTypeExpIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterOclTypeExpIdentifier(TOCLParser.OclTypeExpIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#oclTypeExpIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitOclTypeExpIdentifier(TOCLParser.OclTypeExpIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#isMarkedPre}.
	 * @param ctx the parse tree
	 */
	void enterIsMarkedPre(TOCLParser.IsMarkedPreContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#isMarkedPre}.
	 * @param ctx the parse tree
	 */
	void exitIsMarkedPre(TOCLParser.IsMarkedPreContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(TOCLParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(TOCLParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#letExp}.
	 * @param ctx the parse tree
	 */
	void enterLetExp(TOCLParser.LetExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#letExp}.
	 * @param ctx the parse tree
	 */
	void exitLetExp(TOCLParser.LetExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#letExpSub}.
	 * @param ctx the parse tree
	 */
	void enterLetExpSub(TOCLParser.LetExpSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#letExpSub}.
	 * @param ctx the parse tree
	 */
	void exitLetExpSub(TOCLParser.LetExpSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#ifExp}.
	 * @param ctx the parse tree
	 */
	void enterIfExp(TOCLParser.IfExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#ifExp}.
	 * @param ctx the parse tree
	 */
	void exitIfExp(TOCLParser.IfExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#nullLiteralExp}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteralExp(TOCLParser.NullLiteralExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#nullLiteralExp}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteralExp(TOCLParser.NullLiteralExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#invalidLiteralExp}.
	 * @param ctx the parse tree
	 */
	void enterInvalidLiteralExp(TOCLParser.InvalidLiteralExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#invalidLiteralExp}.
	 * @param ctx the parse tree
	 */
	void exitInvalidLiteralExp(TOCLParser.InvalidLiteralExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(TOCLParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(TOCLParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#contextDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterContextDeclaration(TOCLParser.ContextDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#contextDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitContextDeclaration(TOCLParser.ContextDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#propertyContextDecl}.
	 * @param ctx the parse tree
	 */
	void enterPropertyContextDecl(TOCLParser.PropertyContextDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#propertyContextDecl}.
	 * @param ctx the parse tree
	 */
	void exitPropertyContextDecl(TOCLParser.PropertyContextDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#initOrDerValue}.
	 * @param ctx the parse tree
	 */
	void enterInitOrDerValue(TOCLParser.InitOrDerValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#initOrDerValue}.
	 * @param ctx the parse tree
	 */
	void exitInitOrDerValue(TOCLParser.InitOrDerValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#classifierContextDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassifierContextDecl(TOCLParser.ClassifierContextDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#classifierContextDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassifierContextDecl(TOCLParser.ClassifierContextDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#invOrDef}.
	 * @param ctx the parse tree
	 */
	void enterInvOrDef(TOCLParser.InvOrDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#invOrDef}.
	 * @param ctx the parse tree
	 */
	void exitInvOrDef(TOCLParser.InvOrDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#defExpression}.
	 * @param ctx the parse tree
	 */
	void enterDefExpression(TOCLParser.DefExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#defExpression}.
	 * @param ctx the parse tree
	 */
	void exitDefExpression(TOCLParser.DefExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#operationContextDecl}.
	 * @param ctx the parse tree
	 */
	void enterOperationContextDecl(TOCLParser.OperationContextDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#operationContextDecl}.
	 * @param ctx the parse tree
	 */
	void exitOperationContextDecl(TOCLParser.OperationContextDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#prePostOrBodyDecl}.
	 * @param ctx the parse tree
	 */
	void enterPrePostOrBodyDecl(TOCLParser.PrePostOrBodyDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#prePostOrBodyDecl}.
	 * @param ctx the parse tree
	 */
	void exitPrePostOrBodyDecl(TOCLParser.PrePostOrBodyDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(TOCLParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(TOCLParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(TOCLParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(TOCLParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#toclExpression}.
	 * @param ctx the parse tree
	 */
	void enterToclExpression(TOCLParser.ToclExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#toclExpression}.
	 * @param ctx the parse tree
	 */
	void exitToclExpression(TOCLParser.ToclExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#nextExp}.
	 * @param ctx the parse tree
	 */
	void enterNextExp(TOCLParser.NextExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#nextExp}.
	 * @param ctx the parse tree
	 */
	void exitNextExp(TOCLParser.NextExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#alwaysExp}.
	 * @param ctx the parse tree
	 */
	void enterAlwaysExp(TOCLParser.AlwaysExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#alwaysExp}.
	 * @param ctx the parse tree
	 */
	void exitAlwaysExp(TOCLParser.AlwaysExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#sometimeExp}.
	 * @param ctx the parse tree
	 */
	void enterSometimeExp(TOCLParser.SometimeExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#sometimeExp}.
	 * @param ctx the parse tree
	 */
	void exitSometimeExp(TOCLParser.SometimeExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#previousExp}.
	 * @param ctx the parse tree
	 */
	void enterPreviousExp(TOCLParser.PreviousExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#previousExp}.
	 * @param ctx the parse tree
	 */
	void exitPreviousExp(TOCLParser.PreviousExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#alwaysPastExp}.
	 * @param ctx the parse tree
	 */
	void enterAlwaysPastExp(TOCLParser.AlwaysPastExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#alwaysPastExp}.
	 * @param ctx the parse tree
	 */
	void exitAlwaysPastExp(TOCLParser.AlwaysPastExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#sometimePastExp}.
	 * @param ctx the parse tree
	 */
	void enterSometimePastExp(TOCLParser.SometimePastExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#sometimePastExp}.
	 * @param ctx the parse tree
	 */
	void exitSometimePastExp(TOCLParser.SometimePastExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TOCLParser#nextOperationCallExp}.
	 * @param ctx the parse tree
	 */
	void enterNextOperationCallExp(TOCLParser.NextOperationCallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TOCLParser#nextOperationCallExp}.
	 * @param ctx the parse tree
	 */
	void exitNextOperationCallExp(TOCLParser.NextOperationCallExpContext ctx);
}