from django.http import HttpResponse, Http404
from django.shortcuts import render

# Create your views here.

def index(request):
    return render(request, "singlePageApp/index.html")

texts = ["Paragraphs are the building blocks of papers. Many students define paragraphs in terms of length: a paragraph is a group of at least five sentences, a paragraph is half a page long, etc.",
        "In reality, though, the unity and coherence of ideas among sentences is what constitutes a paragraph. A paragraph is defined as “a group of sentences or a single sentence that forms a unit” (Lunsford and Connors 116).",
        " Length and appearance do not determine whether a section in a paper is a paragraph. For instance, in some styles of writing, particularly journalistic styles, a paragraph can be just one sentence long. Ultimately, a paragraph is a sentence or group of sentences that support one main idea. In this handout, we will refer to this as the “controlling idea,” because it controls what happens in the rest of the paragraph."]

def section(request, num):
    if 1 <= num <=3:
        return HttpResponse(texts[num - 1])
    else:
        raise Http404("No such section")