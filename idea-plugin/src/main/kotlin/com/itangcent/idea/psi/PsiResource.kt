package com.itangcent.idea.psi

import com.intellij.psi.PsiClass
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiMethod
import com.itangcent.common.model.Doc

interface PsiResource {

    fun resourceClass(): PsiClass?

    fun resource(): PsiElement?

}

fun Doc?.resourceClass(): PsiClass? {
    if (this?.resource == null) return null
    val res = this.resource
    return when (res) {
        is PsiResource -> res.resourceClass()
        is PsiClass -> res
        is PsiMethod -> res.containingClass
        else -> null
    }
}

fun Doc?.resource(): PsiElement? {
    if (this?.resource == null) return null
    val res = this.resource
    return when (res) {
        is PsiResource -> res.resource()
        is PsiElement -> res
        else -> null
    }
}

fun Doc?.resourceMethod(): PsiMethod? {
    val res = this.resource()
    return when (res) {
        is PsiMethod -> res
        else -> null
    }
}